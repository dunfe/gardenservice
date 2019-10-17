package com.main.garderservice.Model;

public class Contact {
    private String address;
    private String city;
    private String country;
    private String phone;
    private String email;

    public Contact() {
    }

    public Contact(String address, String city, String country, String phone, String email) {
        this.address = address;
        this.city = city;
        this.country = country;
        this.phone = phone;
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
