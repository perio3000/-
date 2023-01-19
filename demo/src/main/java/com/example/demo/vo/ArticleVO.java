package com.example.demo.vo;

import lombok.*;
import java.sql.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ArticleVO {
    private int id;
    private String title;
    private String content;
    private String author;
    private Date written_date;


}
