package com.example.demo.entities;


public class Payment {

    private Integer paymentID;
    private String user;
    private Float amount;
    private String date;
    private String hour;

    public Payment(Integer paymentID, String user, Float amount, String date, String hour) {
        this.paymentID = paymentID;
        this.user = user;
        this.amount = amount;
        this.date = date;
        this.hour = hour;
    }

    public Payment() {

    }

    public Integer getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(Integer paymentID) {
        this.paymentID = paymentID;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
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
