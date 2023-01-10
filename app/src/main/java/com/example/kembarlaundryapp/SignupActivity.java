package com.example.kembarlaundryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class SignupActivity extends AppCompatActivity {

    EditText username, email, passsword, confPassword;
    Button login, register;
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        username = (EditText) findViewById(R.id.edt_usernameRegister);
        email = (EditText) findViewById(R.id.edt_emailRegister);
        passsword = (EditText) findViewById(R.id.edt_passwordRegister);
        confPassword = (EditText) findViewById(R.id.edt_confPasswordRegister);
        login = (Button) findViewById(R.id.btn_loginRegister);
        register = (Button) findViewById(R.id.btn_registerRegister);
        progressDialog = new ProgressDialog(SignupActivity.this);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginIntent = new Intent(SignupActivity.this, LoginActivity.class);
                startActivity(loginIntent);
            }
        });

        register.setOnClickListener(v -> {
            Toast.makeText(SignupActivity.this, "Akun berhasil didaftarkan, silahkan login", Toast.LENGTH_SHORT).show();
        });
                ;
    }
}