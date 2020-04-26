package com.lagou.springboot.service;

import com.lagou.springboot.entity.Article;
import org.springframework.data.domain.Page;

/**
 * @author bobcheng
 * @date 2020/4/26
 */
public interface ArticleService {

    Page<Article> page(int pageNum, int pageSize);

}
