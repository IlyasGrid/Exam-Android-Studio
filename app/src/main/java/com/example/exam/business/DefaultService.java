package com.example.exam.business;

import com.example.exam.dao.UserDao;
import com.example.exam.models.User;

public class DefaultService implements Service{
    private UserDao userDao;
    public DefaultService(UserDao userDao){
        this.userDao=userDao;
    }
    @Override
    public User login(String login, String password) {
        User user=userDao.get(login);
        if(user==null)
            return null;

        if(user.getPassword().equals(password))
            return user;

        return null;
    }

    @Override
    public User register(String fullName, int phone, String email, String password, String confirmPassword) {
        return null;
    }

}
