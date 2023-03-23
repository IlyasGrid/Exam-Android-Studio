package com.example.exam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.exam.models.User;

public class AccuielActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accuiel);
        Intent intent= getIntent();
        User user = (User) intent.getSerializableExtra("user");
        Toast.makeText(this, "hello "+user.getFullName(), Toast.LENGTH_SHORT).show();
    }
}