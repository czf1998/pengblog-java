package com.pengblog.api;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.pengblog.bean.Article;
import com.pengblog.service.IarticleService;

/**
 * @author Peng Kaifan
 * ��article�йصĽӿ�
 *
 */

@Controller
@RequestMapping("/article")
public class ArticleController {
	
	@Autowired
	@Qualifier("articleService")
	private IarticleService articleService;
	
	@RequestMapping("/article_summary.do")
	@ResponseBody
	public Object getArticleSummary(HttpServletRequest request,
									HttpServletResponse response,
									int currentPage,
									int pageScale) {
		
			response.setHeader("Access-Control-Allow-Origin", "*");
		
			System.out.println("ִ��");
			//��ȡ�����б�
			Article[] articleList = articleService.getArticleSummary(currentPage,pageScale);
			
			//����ҳ���ģ��ȡ��ҳ��
			int maxPage = articleService.getMaxPage(pageScale);
			
			//��װjson
			Gson gson = new Gson();
			HashMap<String,Object> ret = new HashMap<String,Object>();
			ret.put("articleList", articleList);
			ret.put("maxPage",maxPage);
			String retJson = gson.toJson(ret);
			
			return retJson;
	}
	
	
}
