package com.soap.producer.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.soap.producer.entity.Article;



public interface ArticleRepository extends CrudRepository<Article, Long>{

	Article findByArticleId(long articleId);
	
	List<Article> findByTitleAndCategory(String title, String category);
}
