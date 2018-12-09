package com.duck2play.duck2play.Service;


import com.duck2play.duck2play.Entity.Article;
import com.duck2play.duck2play.Repo.ArticleRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {
    @Autowired
    private ArticleRepos articleRepos;

    public List<Article> getAllArticle(){
        return articleRepos.findAll();
    }
}
