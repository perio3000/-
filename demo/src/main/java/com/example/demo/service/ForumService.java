package com.example.demo.service;

import com.example.demo.vo.ArticleVO;

import java.util.List;

public interface ForumService {
    public List<ArticleVO> getList();//投稿リスト

    ArticleVO read_content(int id);//個別閲覧機能

    ArticleVO edit_content(int id);
}
