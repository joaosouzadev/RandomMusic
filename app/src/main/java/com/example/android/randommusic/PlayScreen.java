package com.example.android.randommusic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import org.w3c.dom.Text;


public class PlayScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_screen);

        // initializing the buttons
        ImageButton play = (ImageButton)findViewById(R.id.playbutton);
        ImageButton pause = (ImageButton)findViewById(R.id.pausebutton);
        ImageButton stop = (ImageButton)findViewById(R.id.stopbutton);
        TextView payment = (TextView)findViewById(R.id.buybutton);

        // method for media player
        final MediaPlayer mp = MediaPlayer.create(PlayScreen.this, R.raw.manofconstantsorrow);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
            }
        });

        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.pause();
            }
        });

        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.stop();
                PlayScreen.this.finish();
            }
        });

        // getting the Genre String variable from first activity
        Bundle extras = getIntent().getExtras();
        String genre = extras.getString("genre");

        // setting the textview to display the correct genre playlist
        TextView playing = (TextView)findViewById(R.id.playing);
        playing.setText("Now playing " + genre + " playlist.");

        // method to go to payment activity
        payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotopaymentIntent = new Intent(PlayScreen.this, PaymentScreen.class);
                startActivity(gotopaymentIntent);
            }
        });

    }
}
