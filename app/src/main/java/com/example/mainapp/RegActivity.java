package com.example.mainapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
public class RegActivity extends AppCompatActivity {
    private EditText etEmail;
    private EditText etNick;
    private EditText etCity;
    private EditText etPass;
    private EditText etPassConf;
    private AppCompatButton btSignUp;




    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_registration);
        etEmail = findViewById(R.id.et_register_email);
        etNick = findViewById(R.id.et_register_nick);
        etCity = findViewById(R.id.et_register_city);
        etPass = findViewById(R.id.et_register_password);
        etPassConf = findViewById(R.id.et_register_passwordConfirm);
        btSignUp = findViewById(R.id.bt_register_signIn);



        btSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = etEmail.getText().toString();
                String nick = etNick.getText().toString();
                String city = etCity.getText().toString();
                String pass = etPass.getText().toString();
                String passConf = etPassConf.getText().toString();

            }
        });


    }
}