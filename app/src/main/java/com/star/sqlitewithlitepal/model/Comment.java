package com.star.sqlitewithlitepal.model;


import org.litepal.crud.DataSupport;

import java.util.Date;

public class Comment extends DataSupport {

    private int id;
    private String content;
    private Date publishedDate;

    private News news;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(Date publishedDate) {
        this.publishedDate = publishedDate;
    }

    public News getNews() {
        return news;
    }

    public void setNews(News news) {
        this.news = news;
    }
}
