package com.soap.producer.service;

import java.util.List;

import com.soap.producer.entity.Article;

public interface IArticleService {

	Article getArticleById(long articleId);

	List<Article> getAllArticles();

	boolean addArticle(Article article);

	void updateArticle(Article article);

	void deleteArticle(Article article);

	
}
