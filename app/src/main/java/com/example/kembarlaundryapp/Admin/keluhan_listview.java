package com.example.kembarlaundryapp.Admin;

import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class keluhan_listview extends AppCompatActivity {
    int img;
    String nama, telp, keluhan;

    public keluhan_listview(int img, String nama, String telp, String keluhan) {
        this.img = img;
        this.nama = nama;
        this.telp = telp;
        this.keluhan = keluhan;
    }


    public String getNama() {
        return nama;
    }

    public String getTelp() {
        return telp;
    }

    public String getKeluhan() {
        return keluhan;
    }

    public int getImage() {
        return img;
    }
}

