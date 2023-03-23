package com.example.exam.dao;

import com.example.exam.models.User;

import java.util.List;
import java.util.Vector;

public class UserDaoMemory implements UserDao {
    private List<User> users;
    public UserDaoMemory(){
        users=new Vector<>();
        users.add(new User("ilyasGrid",060000000,"ilyasGrid@gmail.com","ilyas"));
        users.add(new User("simo",060000000,"simo@gmail.com","simo"));
    }

    public User get(String email) {
        for (User u :users)
            if(u.getEmail().equals(email))
                return u;
        return null;
    }
}
