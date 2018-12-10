package com.example.demo.entities;


public class Order {

    private Integer sagaID;
    private Integer orderID;
    private String user;
    private String article;
    private Integer quantity;
    private Float price;
    private String date;
    private String hour;

    public Order(Integer sagaID, Integer orderID, String user, String article, Integer quantity,
                 Float price, String date, String hour) {
        this.sagaID = sagaID;
        this.orderID = orderID;
        this.user = user;
        this.article = article;
        this.quantity = quantity;
        this.price = price;
        this.date = date;
        this.hour = hour;
    }

    public Order() {

    }

    public Integer getSagaID() {
        return sagaID;
    }

    public void setSagaID(Integer sagaID) {
        this.sagaID = sagaID;
    }

    public Integer getOrderID() {
        return orderID;
    }

    public void setOrderID(Integer orderID) {
        this.orderID = orderID;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }
}
