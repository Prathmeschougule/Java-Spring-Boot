package com.learn.crudapi.Model;

public class Shop {

    private int id;
    private String item;
    private String auther;

    public String getAuther() {
        return auther;
    }

    public int getId() {
        return id;
    }

    public String getItem() {
        return item;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setItem(String item) {
        this.item = item;
    }

}
