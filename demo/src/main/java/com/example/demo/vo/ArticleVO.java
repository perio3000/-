package com.example.demo.vo;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@Slf4j
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ArticleVO {
    private int id;
    private String title;
    private String content;
    private String author;
    private String writtenDate;


}
