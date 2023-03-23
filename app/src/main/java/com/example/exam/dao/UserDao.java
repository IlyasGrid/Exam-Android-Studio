package com.example.exam.dao;

import com.example.exam.models.User;

public interface UserDao {
    User get(String login);
}
