package com.example.kembarlaundryapp.Admin;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.kembarlaundryapp.R;

import java.util.List;

public class keluhan_adapter extends ArrayAdapter<keluhan_listview> {
    //the list values in the List of type hero
    List<keluhan_listview> keluhan_data, keluhan;

    //activity context
    Context context;

    //the layout resource file for the list items
    int resource;

    //constructor initializing the values
    public keluhan_adapter(Context context, int resource, List<keluhan_listview> keluhan_data) {
        super(context, resource, keluhan_data);
        this.context = context;
        this.resource = resource;
        this.keluhan_data = keluhan_data;
    }

    //this will return the ListView Item as a View
    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        //we need to get the view of the xml for our list item
        //And for this we need a layoutinflater
        LayoutInflater layoutInflater = LayoutInflater.from(context);

        //getting the view
        View view = layoutInflater.inflate(resource, null, false);
        //convertView = layoutInflater.inflate(resource, parent,false);
        ImageView image = view.findViewById(R.id.kel_profile);
        TextView Nama = view.findViewById(R.id.txt_kel_nama);
        TextView Telp = view.findViewById(R.id.txt_kel_telp);
        TextView Keluhan = view.findViewById(R.id.txt_kel_keluhan);


        //getting the view elements of the list from the view


        //getting the hero of the specified position
        keluhan_listview keluhan = keluhan_data.get(position);
        image.setImageResource(getItem(position).getImage());

        //adding values to the list item
        Nama.setText(keluhan.getNama());
        Telp.setText(keluhan.getTelp());
        Keluhan.setText(keluhan.getKeluhan());

        //adding a click listener to the button to remove item from the list


        //finally returning the view
        return view;
        // return convertView;
    }

}