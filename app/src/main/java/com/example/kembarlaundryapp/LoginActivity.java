package com.example.kembarlaundryapp;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.kembarlaundryapp.Admin.AdminHomeActivity;
import com.example.kembarlaundryapp.User.User;
import com.example.kembarlaundryapp.User.UserHomeActivity;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

        EditText editTextUsername, editTextPassword;
        Button login, register;
        
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_login);

                editTextUsername = (EditText) findViewById(R.id.edt_usernameLogin);
                editTextPassword = (EditText) findViewById(R.id.edt_passwordLogin);
                login = (Button) findViewById(R.id.btn_loginLogin);
                register = (Button) findViewById(R.id.btn_registerLogin);
                login.setOnClickListener(this);

                register.setOnClickListener(v -> {
                        Intent registerIntent = new Intent(LoginActivity.this, SignupActivity.class);
                        startActivity(registerIntent);
                });

        }

        public void onClick(View v) {

                String username = editTextUsername.getText().toString().trim();
                String password = editTextPassword.getText().toString().trim();

                // Cek apakah input sudah diisi
                if (username.isEmpty()) {
                        editTextUsername.setError("Username harus diisi");
                } else if (password.isEmpty()) {
                        editTextPassword.setError("Password harus diisi");
                } else {
                        if (username.equals("admin") && password.equals("admin")) {
                                SharedPrefManager.getInstance(LoginActivity.this).saveLoginDetails(new User(1, username, "admin"));
                                startActivity(new Intent(LoginActivity.this, AdminHomeActivity.class));
                                finish();
                        } else if (username.equals("user") && password.equals("user")) {
                                SharedPrefManager.getInstance(LoginActivity.this).saveLoginDetails(new User(2, username, "user"));
                                startActivity(new Intent(LoginActivity.this, UserHomeActivity.class));
                                finish();
                        } else  {
                                Toast.makeText(LoginActivity.this, "Username atau password salah", Toast.LENGTH_SHORT).show();
                        }
                }
        }

        }