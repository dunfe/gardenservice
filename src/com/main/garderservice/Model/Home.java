package com.main.garderservice.Model;

public class Home {
    private String name;
    private String description;
    private String about;
    private String signature;

    public Home() {

    }

    public Home(String name, String description, String about, String signature) {
        this.name = name;
        this.description = description;
        this.about = about;
        this.signature = signature;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
