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

public class pickup_adapter extends ArrayAdapter<pickup_listview> {
    //the list values in the List of type hero
    List<pickup_listview> pickup_data, pickup;

    //activity context
    Context context;

    //the layout resource file for the list items
    int resource;

    //constructor initializing the values
    public pickup_adapter(Context context, int resource, List<pickup_listview> pickup_data) {
        super(context, resource, pickup_data);
        this.context = context;
        this.resource = resource;
        this.pickup_data = pickup_data;
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
        ImageView image = view.findViewById(R.id.pickup_profile);
        TextView Nama = view.findViewById(R.id.txt_pick_nama);
        TextView Telp = view.findViewById(R.id.txt_pick_telp);
        TextView Alamat = view.findViewById(R.id.txt_pick_alamat);


        //getting the view elements of the list from the view


        //getting the hero of the specified position
        pickup_listview pickup = pickup_data.get(position);
        image.setImageResource(getItem(position).getImage());

        //adding values to the list item
        Nama.setText(pickup.getNama());
        Telp.setText(pickup.getTelp());
        Alamat.setText(pickup.getAlamat());

        //adding a click listener to the button to remove item from the list


        //finally returning the view
        return view;
       // return convertView;
    }

}