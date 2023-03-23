package com.example.exam.actions;

import android.widget.Button;
import android.widget.EditText;

import com.example.exam.MainActivity;
import com.example.exam.RegisterActivity;

public class Register {
    private RegisterActivity registerActivity;
    private EditText email;
    private EditText password;
    private EditText confirmpwd
    private Button registerBtn;
    private EditText phone;
    public Register(RegisterActivity registerActivity){
        this.registerActivity =registerActivity;
        email = registerActivity.getEmail();
        password = registerActivity.getPwd();
        registerActivity = registerActivity.getRegisterbtn();
    }
}
