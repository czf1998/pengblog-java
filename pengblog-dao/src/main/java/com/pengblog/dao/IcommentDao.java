/**
 * 
 */
package com.pengblog.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.pengblog.bean.Comment;

/**
 * @author Administrator
 *
 */
public interface IcommentDao {
	
	int selectCountOfCommentByHostId(@Param("hostId")int hostId);
	
	Comment[] selectCommentListByLimitIndex(@Param("hostId")int hostId, @Param("startIndex")int startIndex, @Param("pageScale")int pageScale);

	Comment selectCommentById(int comment_id);

	int insertComment(Comment comment);

	void deleteCommentByArticleId(int article_id);

	List<Comment> selectCommentLastList(int listScale);
	
}
