package com.example.kembarlaundryapp.Admin;

import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.kembarlaundryapp.R;

public class listview extends AppCompatActivity {
    int img;
    String resi, name, berat, biaya;

    public listview(int image, String resi, String name, String berat, String biaya) {
        this.img = image;
        this.resi = resi;
        this.name = name;
        this.berat = berat;
        this.biaya = biaya;
    }

    public String getResi() {
        return resi;
    }

    public String getName() {
        return name;
    }

    public String getBerat() {
        return berat;
    }

    public String getBiaya() {
        return biaya;
    }

    public int getImage() {
        return img;
    }

    protected void onCreate(){

        RadioGroup radioGroup_antrian = (RadioGroup) findViewById(R.id.radioGroup_antrian);
        radioGroup_antrian.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.radio_antrian1) {
                    Toast.makeText(getApplicationContext(), "Laundry Berhasil Ditambahkan", Toast.LENGTH_SHORT).show();
                } else if (checkedId == R.id.radio_antrian2) {
                    Toast.makeText(getApplicationContext(), "Laundry Sedang Diproses", Toast.LENGTH_SHORT).show();
                } else if (checkedId == R.id.radio_antrian3) {
                    Toast.makeText(getApplicationContext(), "Laundry Telah Selesai", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Anda Belum Memilih Apapun", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
