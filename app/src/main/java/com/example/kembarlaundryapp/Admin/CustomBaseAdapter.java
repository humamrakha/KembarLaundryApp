package com.example.kembarlaundryapp.Admin;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.kembarlaundryapp.R;

import java.util.List;

public class CustomBaseAdapter extends ArrayAdapter<listview> {
    //the list values in the List of type hero
    List<listview> heroList, pickup;

    //activity context
    Context context;

    //the layout resource file for the list items
    int resource;

    //constructor initializing the values
    public CustomBaseAdapter(Context context, int resource, List<listview> heroList) {
        super(context, resource, heroList);
        this.context = context;
        this.resource = resource;
        this.heroList = heroList;
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

        //getting the view elements of the list from the view
        ImageView image = view.findViewById(R.id.antri_profile);
        TextView textViewResi = view.findViewById(R.id.textViewTeam);
        TextView textViewName = view.findViewById(R.id.textViewName);
        TextView textViewBerat = view.findViewById(R.id.textViewBerat);
        TextView textViewBiaya = view.findViewById(R.id.textViewBiaya);
        RadioGroup radioGroup_antrian = view.findViewById(R.id.radioGroup_antrian);

        //getting the hero of the specified position
        listview hero = heroList.get(position);

        //adding values to the list item
        textViewResi.setText(hero.getResi());
        textViewName.setText(hero.getName());
        textViewBerat.setText(hero.getBerat());
        textViewBiaya.setText(hero.getBiaya());
        image.setImageResource(getItem(position).getImage());

        //adding a click listener to the button to remove item from the list


        //finally returning the view
        return view;
    }

    }