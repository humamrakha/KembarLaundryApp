package com.example.kembarlaundryapp.Admin;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;


import androidx.appcompat.app.AppCompatActivity;

import com.example.kembarlaundryapp.R;

import java.util.ArrayList;
import java.util.List;

public class PickupActivity extends AppCompatActivity {
    List<pickup_listview> pickup_data;

    //the listview
    ListView pickupData;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pickup_activity);

        pickup_data = new ArrayList<>();
        pickupData = (ListView) findViewById(R.id.pickup_listview);

        //adding some values to our list
        pickup_data.add(new pickup_listview(R.drawable.profile, "Frank Lampard", "+6281234567890", "Jln. Biru No. 8"));
        pickup_data.add(new pickup_listview(R.drawable.profile,"Steven Gerrad", "+6281234567890", "Jln. Merah No. 4"));
        pickup_data.add(new pickup_listview(R.drawable.profile,"Hernan Crespo", "+6281234567890", "Jln. Milanos No. 11"));
        pickup_data.add(new pickup_listview(R.drawable.profile,"Ian Rush", "+6281234567890", "Jln. Merah No. 9"));
        pickup_data.add(new pickup_listview(R.drawable.profile,"Alessandro Nesta", "+6281234567890", "Jln. Merah No. 13"));
        pickup_data.add(new pickup_listview(R.drawable.profile,"Ricardo Kaka", "+6281234567890", "Jln. Milanos No. 22"));

        //creating the adapter
        pickup_adapter adapter = new pickup_adapter(this, R.layout.pickup_listview, pickup_data);

        //attaching adapter to the listview
        pickupData.setAdapter(adapter);

        back = (Button) findViewById(R.id.btn_tambah_back);

        back.setOnClickListener(v -> {
            Intent i = new Intent(PickupActivity.this, AdminHomeActivity.class);
            startActivity(i);
        });

    }
}
