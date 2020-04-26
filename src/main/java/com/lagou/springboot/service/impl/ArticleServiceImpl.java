package com.lagou.springboot.service.impl;

import com.lagou.springboot.entity.Article;
import com.lagou.springboot.repository.ArticleRepository;
import com.lagou.springboot.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * @author bobcheng
 * @date 2020/4/26
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleRepository articleRepository;

    public Page<Article> page(int pageNum, int pageSize) {
        Pageable pageable = PageRequest.of(pageNum, pageSize);
        return articleRepository.findAll(pageable);
    }


}
