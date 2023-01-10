package com.example.kembarlaundryapp.User;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.kembarlaundryapp.LoginActivity;
import com.example.kembarlaundryapp.R;


public class UserHomeActivity extends AppCompatActivity {
    Button cek, pesan, cs, keluar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_home);

            cek = (Button) findViewById(R.id.btn_aduan);
            pesan = (Button) findViewById(R.id.btn_admin_antrian);
            cs = (Button) findViewById(R.id.btn_add);
            keluar = (Button) findViewById(R.id.btn_pesanan_baru);

            cek.setOnClickListener(v -> {
                Intent registerIntent = new Intent(UserHomeActivity.this, activity_cek_resi.class);
                startActivity(registerIntent);
            });
        pesan.setOnClickListener(v -> {
            Intent pesan = new Intent(UserHomeActivity.this, LoginActivity.class);
            startActivity(pesan);
        });
        cs.setOnClickListener(v -> {
            Intent registerIntent = new Intent(UserHomeActivity.this, activity_cs.class);
            startActivity(registerIntent);
        });
        keluar.setOnClickListener(v -> {
            Intent registerIntent = new Intent(UserHomeActivity.this, activity_pesan.class);
            startActivity(registerIntent);
        });


    }}

