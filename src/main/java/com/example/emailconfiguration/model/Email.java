package com.example.emailconfiguration.model;

import java.util.List;

public class Email {
    private String languages;
    private String pageSizes;
    private boolean spamsFilter;
    private String signature;

    public Email() {}
    public Email(String languages, String pageSizes, boolean spamsFilter, String signature) {
        this.languages = languages;
        this.pageSizes = pageSizes;
        this.spamsFilter = spamsFilter;
        this.signature = signature;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public String getPageSizes() {
        return pageSizes;
    }

    public void setPageSizes(String pageSizes) {
        this.pageSizes = pageSizes;
    }

    public boolean isSpamsFilter() {
        return spamsFilter;
    }

    public void setSpamsFilter(boolean spamsFilter) {
        this.spamsFilter = spamsFilter;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
