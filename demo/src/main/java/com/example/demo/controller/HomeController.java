package com.example.demo.controller;

import com.example.demo.service.ForumService;
import com.example.demo.vo.ArticleVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
@Slf4j
public class HomeController {

    @Autowired
    private ForumService forumService;

    @GetMapping("/")
    public String index(){
        log.info("index()....");

        return "index";


    }
    @GetMapping("/list")
    public String articleList(Model model){
        log.info("articleList()...");
        model.addAttribute("forum", forumService.getList());
        return "list";
    }

}
