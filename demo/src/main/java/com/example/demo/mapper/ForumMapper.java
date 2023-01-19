package com.example.demo.mapper;

import com.example.demo.vo.ArticleVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ForumMapper {
    List<ArticleVO> getList();

    ArticleVO read_content(int id);

    ArticleVO edit_content(int id);
}
