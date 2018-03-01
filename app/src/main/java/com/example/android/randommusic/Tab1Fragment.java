package com.example.android.randommusic;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class Tab1Fragment extends Fragment {
    private static final String TAG = "Tab1Fragment";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab1_fragment, container, false);

        // Find the View that shows the categories for genre
        TextView rock = (TextView) view.findViewById(R.id.rock);
        TextView pop = (TextView) view.findViewById(R.id.pop);
        TextView country = (TextView) view.findViewById(R.id.country);
        TextView electronic = (TextView) view.findViewById(R.id.electronic);
        TextView blues = (TextView) view.findViewById(R.id.blues);
        TextView classical = (TextView) view.findViewById(R.id.classical);

        //Set a click listener on each genre textview to open play song screen activity
        rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String genre = "Rock";
                Intent playscreenIntent = new Intent(Tab1Fragment.this.getActivity(), PlayScreen.class);
                playscreenIntent.putExtra("genre", genre); // passing the String Genre variable to the PlayScreen activity
                startActivity(playscreenIntent);
            }
        });

        pop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String genre = "Pop";
                Intent playscreenIntent = new Intent(Tab1Fragment.this.getActivity(), PlayScreen.class);
                playscreenIntent.putExtra("genre", genre); // passing the String Genre variable to the PlayScreen activity
                startActivity(playscreenIntent);
            }
        });

        country.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String genre = "Country";
                Intent playscreenIntent = new Intent(Tab1Fragment.this.getActivity(), PlayScreen.class);
                playscreenIntent.putExtra("genre", genre); // passing the String Genre variable to the PlayScreen activity
                startActivity(playscreenIntent);
            }
        });

        electronic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String genre = "Electronic";
                Intent playscreenIntent = new Intent(Tab1Fragment.this.getActivity(), PlayScreen.class);
                playscreenIntent.putExtra("genre", genre); // passing the String Genre variable to the PlayScreen activity
                startActivity(playscreenIntent);
            }
        });

        blues.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String genre = "Blues";
                Intent playscreenIntent = new Intent(Tab1Fragment.this.getActivity(), PlayScreen.class);
                playscreenIntent.putExtra("genre", genre); // passing the String Genre variable to the PlayScreen activity
                startActivity(playscreenIntent);
            }
        });

        classical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String genre = "Classical";
                Intent playscreenIntent = new Intent(Tab1Fragment.this.getActivity(), PlayScreen.class);
                playscreenIntent.putExtra("genre", genre); // passing the String Genre variable to the PlayScreen activity
                startActivity(playscreenIntent);
            }
        });

        return view;
    }
}
