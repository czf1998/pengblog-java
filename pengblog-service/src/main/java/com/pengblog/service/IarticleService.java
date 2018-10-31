package com.pengblog.service;


import java.util.Date;
import java.util.List;
import java.util.Map;

import com.pengblog.bean.Article;

/**
 * @author Administrator
 *	article���ҵ��ӿ�
 */
public interface IarticleService {

	/**
	 * @param currentPage
	 * @param pageScale
	 * @return
	 */
	Article[] getArticleSummaryList(int currentPage, int pageScale);

	/**
	 * @param pageScale
	 * @return
	 */
	int getMaxPage(int pageScale);

	/**
	 * @param article_id
	 * @return
	 */
	Article getArticleById(int article_id);

	Article constructArticle(Map<String, String> articleData);
	
	int saveArticle(Article article);

	Article handleImageUrl(Article article);

	Article[] getDraftList(int currentPage, int pageScale);

	int getMaxPageOfDraft(int pageScale);

	void deleteArticleById(int article_id);

	void updateArticle(Article handledArticle);

	Map<Integer, Object> getarticleFiling();


	List<Map<String, Integer>> getArticleLabelList();

	Article[] getArticleItemListByLimitIndexAndSearchWords(int currentPage, int pageScale, String[] searchWords);

	int getMaxPageBySearchWords(int pageScale, String[] searchWords);

	int getCountOfArticleBySearchWords(String[] searchWords);

	Article[] getArticleItemListByLimitIndexAndYearAndMonth(int currentPage, int pageScale, String selectedYear,
			String selectedMonth);

	int getMaxPageByYearAndMonth(int pageScale, String selectedYear, String selectedMonth);

	int getCountOfArticleByYearAndMonth(String selectedYear, String selectedMonth);

	Article[] getArticleItemListByLimitIndexAndLabel(int currentPage, int pageScale, String article_label);

	int getMaxPageByLabel(int pageScale, String article_label);

	int getCountOfArticleByLabel(String article_label);

	Article handlePreviewImage(Article handledArticle);





}
