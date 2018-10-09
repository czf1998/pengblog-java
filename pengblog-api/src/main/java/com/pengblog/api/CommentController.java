/**
 * 
 */
package com.pengblog.api;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.pengblog.bean.Comment;
import com.pengblog.service.IcommentService;

/**
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/comment")
public class CommentController {
	
	@Autowired
	@Qualifier("commentService")
	private IcommentService commentService;

	@RequestMapping(value="/comment_list.do", produces="application/json;charset=UTF-8")
	@ResponseBody
	public Object getCommentList(int article_id, int currentPage, int pageScale) {
		
		int maxPage = commentService.getMaxPage(article_id, pageScale);
		
		int countOfComment = commentService.getCountOfComment(article_id);
		
		Comment[] commentList = commentService.getCommentList(article_id, currentPage, pageScale);
		
		Gson gson = new Gson();
		Map<String,Object> ret = new HashMap<>();
		ret.put("maxPage", maxPage);
		ret.put("commentList", commentList);
		ret.put("countOfComment", countOfComment);
		String retJson = gson.toJson(ret);
		
		System.out.println(retJson);
		
		return retJson;
	}
	
	@RequestMapping(value="/comment.do", produces="application/json;charset=UTF-8")
	@ResponseBody
	public Object getComment(int comment_id) {
		
		Comment ret = commentService.getCommentById(comment_id);
		
		Gson gson = new Gson();
		
		String retJson = gson.toJson(ret);
		
		return retJson;
	}
}

