package com.example.demo.entities;


public class Stock {

    private Integer sagaID;
    private Integer articleID;
    private String article;
    private Integer available;

    public Stock(Integer sagaID, Integer articleID, String article, Integer available) {
        this.sagaID = sagaID;
        this.articleID = articleID;
        this.article = article;
        this.available = available;
    }

    public Stock() {

    }

    public Integer getSagaID() {
        return sagaID;
    }

    public void setSagaID(Integer sagaID) {
        this.sagaID = sagaID;
    }

    public Integer getArticleID() {
        return articleID;
    }

    public void setArticleID(Integer articleID) {
        this.articleID = articleID;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public Integer getAvailable() {
        return available;
    }

    public void setAvailable(Integer available) {
        this.available = available;
    }
}
