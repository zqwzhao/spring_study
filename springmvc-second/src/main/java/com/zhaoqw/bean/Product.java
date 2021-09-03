package com.zhaoqw.bean;

import java.util.Date;

/**
 * @author : [zqwzh]
 * @version : [v1.0]
 * @createTime : [2021-09-03 8:45]
 */
public class Product {
    private int id;
    private String pnane;
    private Float price;
    private Date date;

    public Product() {
    }

    public Product(int id, String pnane, Float price, Date date) {
        this.id = id;
        this.pnane = pnane;
        this.price = price;
        this.date = date;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPnane() {
        return pnane;
    }

    public void setPnane(String pnane) {
        this.pnane = pnane;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", pnane='" + pnane + '\'' +
                ", price=" + price +
                ", date=" + date +
                '}';
    }
}
