package com.example.mainapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.mainapp.db.ImitationDB;
import com.example.mainapp.domain.Person;

public class MainActivity extends AppCompatActivity {
    private EditText etEmail;
    private EditText etPassword;
    private AppCompatButton btSignIn;
    private AppCompatButton btSignUp;
    private ImitationDB db = new ImitationDB();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        btSignIn = findViewById(R.id.acb_signIn);
        etEmail = findViewById(R.id.et_loginEmail);
        etPassword = findViewById(R.id.et_login_password);
        btSignUp = findViewById(R.id.acb_signUp);

        btSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RegActivity.class);
                startActivity(intent);
            }
        });

        btSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = etEmail.getText().toString();
                String password = etPassword.getText().toString();
                Person personByEmail = db.getPersonByEmail(email);
                if (personByEmail.getPassword().equals(password)) {
                    Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_LONG).show();

                }

            }
        });

    }
}