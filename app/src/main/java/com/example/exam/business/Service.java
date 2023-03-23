package com.example.exam.business;

import com.example.exam.models.User;

public interface Service {

    public User login(String email, String password);
    public User register(String fullName,int phone,String email,String password,String confirmPassword);
}
