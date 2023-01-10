package com.example.kembarlaundryapp.User;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.kembarlaundryapp.R;

public class activity_cs extends AppCompatActivity {
    Button cs, kirim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cs);

            cs = (Button) findViewById(R.id.btn_cs_back);
            kirim = (Button) findViewById(R.id.btn_cs_kirim);

            cs.setOnClickListener(v -> {
                Intent registerIntent = new Intent(activity_cs.this, UserHomeActivity.class);
                startActivity(registerIntent);
            });

            kirim.setOnClickListener(v -> {
                Toast.makeText(activity_cs.this, "Keluhan Berhasil Dikirim", Toast.LENGTH_SHORT).show();
            });
    }
}
