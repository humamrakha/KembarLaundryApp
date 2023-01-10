package com.example.kembarlaundryapp.Admin;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;


import androidx.appcompat.app.AppCompatActivity;

import com.example.kembarlaundryapp.R;

import java.util.ArrayList;
import java.util.List;

public class KeluhanActivity extends AppCompatActivity {
    List<keluhan_listview> keluhan_data;

    //the listview
    ListView keluhanData;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keluhan);

        keluhan_data = new ArrayList<>();
        keluhanData = (ListView) findViewById(R.id.keluhan_listview);

        //adding some values to our list
        keluhan_data.add(new keluhan_listview(R.drawable.profile, "Nicolas Anelka", "+6281234567890", "Jersey saya tertukar dengan Drogba"));
        keluhan_data.add(new keluhan_listview(R.drawable.profile,"Gennaro Gattuso", "+6281234567890", "Kaos kaki saya tidak ada"));
        keluhan_data.add(new keluhan_listview(R.drawable.profile,"Javier Zanneti", "+6281234567890", "Jersey saya tertukar dengan Crespo"));
        keluhan_data.add(new keluhan_listview(R.drawable.profile,"Liam Gallagher", "+6281234567890", "Jaket saya tidak ada"));

        //creating the adapter
        keluhan_adapter adapter = new keluhan_adapter(this, R.layout.keluhan_listview, keluhan_data);

        //attaching adapter to the listview
        keluhanData.setAdapter(adapter);

        back = (Button) findViewById(R.id.btn_keluhan_back);

        back.setOnClickListener(v -> {
            Intent i = new Intent(KeluhanActivity.this, AdminHomeActivity.class);
            startActivity(i);
        });

    }
}
