package com.example.exam.models;

public class User {
    private String fullName;
    private int phone;
    private String email;
    private String password;

    public User() {
    }

    public User(String fullName, int phone, String email, String password) {
        this.fullName = fullName;
        this.phone = phone;
        this.email = email;
        this.password = password;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public int getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
