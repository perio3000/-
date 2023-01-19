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
    //ページ無しの投稿リスト
    @GetMapping("/list")
    public String articleList(Model model){
        log.info("CONTROLLER : articleList()...");
        model.addAttribute("forum", forumService.getList());
        return "list";
    }
    //個別閲覧
    @GetMapping("read_content")
    public String read_content(ArticleVO articleVO, Model model){
        log.info("CONTROLLER : read_content()...");

        int id = articleVO.getId();//ID番号で職別されるため
        model.addAttribute(
                "read_content" , forumService.read_content(id)
        );

        return "read_content";
    }

    @GetMapping("edit_content")
    public String edit_content(ArticleVO articleVO, Model model){
        log.info("CONTROLLER : edit()...");

        int id = articleVO.getId();//ID番号で職別されるため
        model.addAttribute(
                "edit_content" , forumService.edit_content(id)
        );

        return "edit_content";
    }
}
