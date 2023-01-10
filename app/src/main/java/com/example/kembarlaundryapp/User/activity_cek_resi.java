package com.example.kembarlaundryapp.User;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.kembarlaundryapp.R;

public class activity_cek_resi extends Activity {

    Button kembali, cek;
    EditText resi;
    Dialog mDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resi);

        kembali = (Button) findViewById(R.id.btn_resi_back);
        cek = (Button) findViewById(R.id.btn_cek_resi);
        resi = (EditText) findViewById(R.id.edt_cek_resi);
        mDialog = new Dialog(this);

        kembali.setOnClickListener(v -> {
            Intent registerIntent = new Intent(activity_cek_resi.this, UserHomeActivity.class);
            startActivity(registerIntent);
        });

        cek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cek_resi = resi.getText().toString().trim();

                // Cek apakah input sudah diisi
                if (cek_resi.isEmpty()) {
                    resi.setError("Pastikan Nomor Resi Benar");
                } else {
                    if (cek_resi.equals("KL010101O")) {
                        mDialog.setContentView(R.layout.activity_pencarian_resi);
                        mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                        mDialog.show();
                    } else if (cek_resi.equals("KL010101M")) {
                        mDialog.setContentView(R.layout.activity_pencarian_resi2);
                        mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                        mDialog.show();
                    } else  {
                        Toast.makeText(activity_cek_resi.this, "Nomor Resi Tidak Terdaftar, Pastikan Nomor Resi Benar", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}
