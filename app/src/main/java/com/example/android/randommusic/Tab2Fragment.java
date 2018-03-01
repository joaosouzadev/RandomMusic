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

/**
 * Created by JOAO on 27-Feb-18.
 */

public class Tab2Fragment extends Fragment {
    private static final String TAG = "Tab2Fragment";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab2_fragment, container, false);

        // Find the View that shows the categories for mood
        TextView happy = (TextView) view.findViewById(R.id.happy);
        TextView fun = (TextView) view.findViewById(R.id.fun);
        TextView dramatic = (TextView) view.findViewById(R.id.dramatic);
        TextView inlove = (TextView) view.findViewById(R.id.inlove);
        TextView relaxing = (TextView) view.findViewById(R.id.relaxing);
        TextView sad = (TextView) view.findViewById(R.id.sad);

        //Set a click listener on each mood textview to open play song screen activity
        happy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String genre = "Happy";
                Intent playscreenIntent = new Intent(Tab2Fragment.this.getActivity(), PlayScreen.class);
                playscreenIntent.putExtra("genre", genre); // passing the String Genre variable to the PlayScreen activity
                startActivity(playscreenIntent);
            }
        });

        fun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String genre = "Fun";
                Intent playscreenIntent = new Intent(Tab2Fragment.this.getActivity(), PlayScreen.class);
                playscreenIntent.putExtra("genre", genre); // passing the String Genre variable to the PlayScreen activity
                startActivity(playscreenIntent);
            }
        });

        dramatic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String genre = "Dramatic";
                Intent playscreenIntent = new Intent(Tab2Fragment.this.getActivity(), PlayScreen.class);
                playscreenIntent.putExtra("genre", genre); // passing the String Genre variable to the PlayScreen activity
                startActivity(playscreenIntent);
            }
        });

        inlove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String genre = "In Love";
                Intent playscreenIntent = new Intent(Tab2Fragment.this.getActivity(), PlayScreen.class);
                playscreenIntent.putExtra("genre", genre); // passing the String Genre variable to the PlayScreen activity
                startActivity(playscreenIntent);
            }
        });

        relaxing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String genre = "Relaxing";
                Intent playscreenIntent = new Intent(Tab2Fragment.this.getActivity(), PlayScreen.class);
                playscreenIntent.putExtra("genre", genre); // passing the String Genre variable to the PlayScreen activity
                startActivity(playscreenIntent);
            }
        });

        sad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String genre = "Sad";
                Intent playscreenIntent = new Intent(Tab2Fragment.this.getActivity(), PlayScreen.class);
                playscreenIntent.putExtra("genre", genre); // passing the String Genre variable to the PlayScreen activity
                startActivity(playscreenIntent);
            }
        });

        return view;
    }
}
