package com.example.kembarlaundryapp.Admin;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.kembarlaundryapp.R;

public class PesananBaruActivity extends AppCompatActivity {
    Button back, tambah;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesanan_baru);

        back = (Button) findViewById(R.id.btn_pesanan_back);
        tambah = (Button) findViewById(R.id.btn_pesanan_tambah);

        back.setOnClickListener(v -> {
            Intent i = new Intent(PesananBaruActivity.this, AdminHomeActivity.class);
            startActivity(i);
        });

        tambah.setOnClickListener( v -> {
            Toast.makeText(getApplicationContext(), "Pesanan Berhasil Ditambahkan", Toast.LENGTH_SHORT).show();
        });



    }
}

