package com.soap.producer.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soap.producer.entity.Article;
import com.soap.producer.repository.ArticleRepository;

@Service
public class ArticleService implements IArticleService {

	@Autowired
	private ArticleRepository articleRepository;

	@Override
	public Article getArticleById(long articleId) {

		return articleRepository.findByArticleId(articleId);
	}

	@Override
	public List<Article> getAllArticles() {

		List<Article> listOfArticle = new ArrayList<Article>();

		articleRepository.findAll().forEach(e -> listOfArticle.add(e));
		return listOfArticle;
	}

	@Override
	public boolean addArticle(Article article) {
		List<Article> list = articleRepository.findByTitleAndCategory(article.getTitle(), article.getCategory());
		if (list.size() > 0) {
			return false;
		} else {
			article = articleRepository.save(article);
			return true;
		}

	}

	@Override
	public void updateArticle(Article article) {
		articleRepository.save(article);

	}

	@Override
	public void deleteArticle(Article article) {
		articleRepository.delete(article);

	}

}
