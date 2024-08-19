package com.example.emailconfiguration.model;

public class PageSize {
    private int id;
    private int width;

    public PageSize(int id, int width) {
        this.id = id;
        this.width = width;
    }
    public PageSize(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
