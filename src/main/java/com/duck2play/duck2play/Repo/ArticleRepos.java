package com.duck2play.duck2play.Repo;

import com.duck2play.duck2play.Entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ArticleRepos extends JpaRepository<Article, Long> {
    List<Article> findArticleByTitle(String title);
}
