package com.pengblog.bean;

import java.io.Serializable;

/**
 * ���Գ����������ݵ�ʵ��
 * @author Peng Kaifan
 *
 */
public class Article implements Serializable{
	
	/**
	 * ����id
	 */
	private Integer article_id;
	
	/**
	 * ���±���
	 */
	private String article_title;
	
	/**
	 * ��������
	 */
	private String article_author;
	
	/**
	 * ��������
	 */
	private String article_content;
	
	/**
	 * ����ժҪ
	 */
	private String article_summary;

	/**
	 * @return the article_id
	 */
	public Integer getArticle_id() {
		return article_id;
	}

	/**
	 * @param article_id the article_id to set
	 */
	public void setArticle_id(Integer article_id) {
		this.article_id = article_id;
	}

	/**
	 * @return the article_title
	 */
	public String getArticle_title() {
		return article_title;
	}

	/**
	 * @param article_title the article_title to set
	 */
	public void setArticle_title(String article_title) {
		this.article_title = article_title;
	}

	/**
	 * @return the article_author
	 */
	public String getArticle_author() {
		return article_author;
	}

	/**
	 * @param article_author the article_author to set
	 */
	public void setArticle_author(String article_author) {
		this.article_author = article_author;
	}

	/**
	 * @return the article_content
	 */
	public String getArticle_content() {
		return article_content;
	}

	/**
	 * @param article_content the article_content to set
	 */
	public void setArticle_content(String article_content) {
		this.article_content = article_content;
	}

	/**
	 * @return the article_summary
	 */
	public String getArticle_summary() {
		return article_summary;
	}

	/**
	 * @param article_summary the article_summary to set
	 */
	public void setArticle_summary(String article_summary) {
		this.article_summary = article_summary;
	}

	/**
	 * ���ι�����
	 * @param article_id
	 * @param article_title
	 * @param article_author
	 * @param article_content
	 * @param article_summary
	 */
	public Article(Integer article_id, String article_title, String article_author, String article_content, String article_summary) {
		super();
		this.article_id = article_id;
		this.article_title = article_title;
		this.article_author = article_author;
		this.article_content = article_content;
		this.article_summary = article_summary;
	}

	/**
	 * �޲ι�����
	 */
	public Article() {
		super();
	}
	
	
}
