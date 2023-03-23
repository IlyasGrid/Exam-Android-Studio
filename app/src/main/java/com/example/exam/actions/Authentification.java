package com.example.exam.actions;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.exam.AccuielActivity;
import com.example.exam.MainActivity;
import com.example.exam.models.User;

import java.util.Locale;

public class Authentification implements View.OnClickListener {
    private MainActivity mainActivity;
    private EditText email;
    private EditText password;
    private Button loginbtn;

    public Authentification(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
        email = mainActivity.getEmail();
        password = mainActivity.getPwd();
        loginbtn = mainActivity.getLoginbtn();
    }


    @Override
    public void onClick(View view) {
        if (((Button) view).equals(loginbtn)) {
            if (email.getText().toString().equals("") || password.getText().toString().equals("")) {
                Toast.makeText(mainActivity, "ALL  fields are required", Toast.LENGTH_SHORT).show();
                return;
            }
            User user = mainActivity.getService().login(email.getText().toString(), password.getText().toString());
            if (user != null) {
                Intent intent = new Intent(mainActivity, AccuielActivity.class);
                intent.putExtra("User", (CharSequence) user);
                mainActivity.startActivity(intent);
                mainActivity.finish();

            } else {
                Toast.makeText(mainActivity, "error user not found", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
