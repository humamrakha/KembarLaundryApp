package com.example.kembarlaundryapp.User;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.kembarlaundryapp.R;

public class activity_pesan extends AppCompatActivity {
    Button back, kirim;
    EditText nama, telp, alamat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesan);

            back = (Button) findViewById(R.id.btn_pesan_back);
            kirim = (Button) findViewById(R.id.btn_pesan_kirim);
            nama = (EditText) findViewById(R.id.edt_pesan_nama);
            telp = (EditText) findViewById(R.id.edt_pesan_telp);
            alamat = (EditText) findViewById(R.id.edt_pesan_alamat);

            back.setOnClickListener(v -> {
                Intent pesan = new Intent(activity_pesan.this, UserHomeActivity.class);
                startActivity(pesan);
            });

        kirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String kirim_pesanan = kirim.getText().toString().trim();
                String psn_nama = nama.getText().toString().trim();
                String psn_telp = telp.getText().toString().trim();
                String psn_alamat = alamat.getText().toString().trim();

                // Cek apakah input sudah diisi
                if (psn_nama.isEmpty() && psn_telp.isEmpty() && psn_alamat.isEmpty()) {
                    Toast.makeText(activity_pesan.this, "Data Harus Diisi", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(activity_pesan.this, "Pesanan Berhasil Dikirim", Toast.LENGTH_SHORT).show();
        }
            }
        });
    }

}