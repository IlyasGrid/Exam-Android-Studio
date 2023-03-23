package com.example.exam;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.exam.actions.Authentification;
import com.example.exam.business.Service;

public class MainActivity extends Activity {

    private Button loginbtn;
    private EditText email;
    private EditText pwd;
    private Service service;

    private Authentification authentification;




    public Service getService() {
        return service;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        service =((MyContext) getApplicationContext()).getServices();
        loginbtn = findViewById(R.id.Login);
        email = findViewById(R.id.editTextTextEmailAddress);
        pwd = findViewById(R.id.editTextTextPassword);
        authentification=new Authentification(this);
        loginbtn.setOnClickListener(authentification);
    }
    public EditText getEmail() {
        return email;
    }

    public EditText getPwd() {
        return pwd;
    }

    public Button getLoginbtn() {
        return loginbtn;
    }
}