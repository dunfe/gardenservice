package com.main.garderservice.Model;

import java.util.Date;

public class Service {
    private int id;
    private String name;
    private String shortDetail;
    private String fullDetail;
    private String image;
    private Date date;

    public Service() {
    }

    public Service(int id, String name, String shortDetail, String fullDetail, String image, Date date) {
        this.id = id;
        this.name = name;
        this.shortDetail = shortDetail;
        this.fullDetail = fullDetail;
        this.image = image;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortDetail() {
        return shortDetail;
    }

    public void setShortDetail(String shortDetail) {
        this.shortDetail = shortDetail;
    }

    public String getFullDetail() {
        return fullDetail;
    }

    public void setFullDetail(String fullDetail) {
        this.fullDetail = fullDetail;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
