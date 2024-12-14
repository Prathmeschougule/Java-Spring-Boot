package com.learn.crudapi.Model;

public class Book {
    private int id;
    private String name;
    private String authername;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthername() {
        return authername;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthername(String authername) {
        this.authername = authername;
    }
}
