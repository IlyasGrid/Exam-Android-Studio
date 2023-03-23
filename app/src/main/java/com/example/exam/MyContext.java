package com.example.exam;

import android.app.Application;

import com.example.exam.business.DefaultService;
import com.example.exam.business.Service;
import com.example.exam.dao.UserDaoMemory;

public class MyContext extends Application {
    private Service services;

    @Override
    public void onCreate() {
        super.onCreate();
        services=new DefaultService(new UserDaoMemory());
    }

    public Service getServices() {
        return services;
    }
}
