package com.lagou.springboot.controller;

import com.lagou.springboot.entity.Article;
import com.lagou.springboot.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author bobcheng
 * @date 2020/4/26
 */
@Controller
@RequestMapping("article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @RequestMapping("page")
    public String page(Model model, @RequestParam(value = "pageNum", defaultValue = "0") int pageNum,
                       @RequestParam(value = "pageSize", defaultValue = "2") int pageSize) {
        Page<Article> articles = articleService.page(pageNum, pageSize);
        model.addAttribute("articles", articles);
        return "client/index";
    }

}
