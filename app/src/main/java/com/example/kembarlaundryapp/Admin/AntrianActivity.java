package com.example.kembarlaundryapp.Admin;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.kembarlaundryapp.R;

import java.util.ArrayList;
import java.util.List;

public class AntrianActivity extends AppCompatActivity {
    List<listview> heroList;

    //the listview
    ListView listView;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_antrian);

        heroList = new ArrayList<>();
        listView = (ListView) findViewById(R.id.listview);

        //adding some values to our list
        heroList.add(new listview(R.drawable.profile,"KL010101L" , "Lemmy Kilmister", "2kg", "Rp.10.000"));
        heroList.add(new listview(R.drawable.profile,"KL010101D", "Dave Grohl","5kg", "Rp.25.000"));
        heroList.add(new listview(R.drawable.profile,"KL010101O", "Ozzy Osbourne", "6,5kg", "Rp.32.500"));
        heroList.add(new listview(R.drawable.profile,"KL010101M", "Morissey", "10kg", "Rp.50.000"));
        heroList.add(new listview(R.drawable.profile,"KL010101L", "Liam Gallagher", "7kg", "Rp.35.000"));
        heroList.add(new listview(R.drawable.profile,"KL010101J", "James Hetfield", "2kg", "Rp.20.000"));

        //creating the adapter
        CustomBaseAdapter adapter = new CustomBaseAdapter(this, R.layout.listview, heroList);

        //attaching adapter to the listview
        listView.setAdapter(adapter);

        back = (Button) findViewById(R.id.btn_antrian_back);

        back.setOnClickListener(v -> {
            Intent i = new Intent(AntrianActivity.this, AdminHomeActivity.class);
            startActivity(i);
        });

    }
}
