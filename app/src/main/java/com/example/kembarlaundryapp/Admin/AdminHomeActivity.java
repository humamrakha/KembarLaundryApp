package com.example.kembarlaundryapp.Admin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.kembarlaundryapp.LoginActivity;
import com.example.kembarlaundryapp.R;

public class AdminHomeActivity extends Activity {

    Button aduan, antrian, tambah, pesanan, keluar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_home);

        aduan = (Button) findViewById(R.id.btn_aduan);
        antrian = (Button) findViewById(R.id.btn_admin_antrian);
        tambah = (Button) findViewById(R.id.btn_add);
        pesanan = (Button) findViewById(R.id.btn_pesanan_baru);
        keluar = (Button) findViewById(R.id.btn_admin_logout);

        aduan.setOnClickListener(v -> {
            Intent registerIntent = new Intent(AdminHomeActivity.this, KeluhanActivity.class);
            startActivity(registerIntent);
        });
        antrian.setOnClickListener(v -> {
            Intent pesan = new Intent(AdminHomeActivity.this, AntrianActivity.class);
            startActivity(pesan);
        });
        tambah.setOnClickListener(v -> {
            Intent registerIntent = new Intent(AdminHomeActivity.this, PickupActivity.class);
            startActivity(registerIntent);
        });
        pesanan.setOnClickListener(v -> {
            Intent registerIntent = new Intent(AdminHomeActivity.this, PesananBaruActivity.class);
            startActivity(registerIntent);
        });
        keluar.setOnClickListener(v -> {
            Intent registerIntent = new Intent(AdminHomeActivity.this, LoginActivity.class);
            startActivity(registerIntent);
        });


    }}
