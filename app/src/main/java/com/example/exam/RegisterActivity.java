package com.example.exam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {
    private EditText email;
    private EditText password;
    private EditText confirmpwd
    private Button registerBtn;
    private EditText phone;

    public EditText getEmail() {
        return email;
    }

    public EditText getPassword() {
        return password;
    }

    public EditText getConfirmpwd() {
        return confirmpwd;
    }

    public Button getRegisterBtn() {
        return registerBtn;
    }

    public EditText getPhone() {
        return phone;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }
}