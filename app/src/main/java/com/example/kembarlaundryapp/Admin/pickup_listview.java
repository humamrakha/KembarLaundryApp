package com.example.kembarlaundryapp.Admin;

import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class pickup_listview extends AppCompatActivity {
    int img;
    String nama, telp, alamat;

    public pickup_listview(int img, String nama, String telp, String alamat) {
        this.img = img;
        this.nama = nama;
        this.telp = telp;
        this.alamat = alamat;
    }


    public String getNama() {
        return nama;
    }

    public String getTelp() {
        return telp;
    }

    public String getAlamat() {
        return alamat;
    }

    public int getImage() {
        return img;
    }
}

