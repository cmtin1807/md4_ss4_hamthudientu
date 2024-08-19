package com.example.emailconfiguration.model;

public class Languages {
    private int id;
    private String language;

    public Languages(int id, String language) {
        this.id = id;
        this.language = language;
    }
    public Languages(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
