package com.lagou.springboot.repository;

import com.lagou.springboot.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author bobcheng
 * @date 2020/4/26
 */
public interface ArticleRepository extends JpaRepository<Article, Integer> {
}
