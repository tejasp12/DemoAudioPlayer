package com.example.android.demoaudioplayer;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private MediaPlayer mediaPlayer;
    private MediaPlayer mediaPlayer2;
    //int maxVolume = 50;
    //int currentVolume = 0;
    //float log1 = (float)(Math.log(maxVolume-currentVolume)/Math.log(maxVolume));
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Use Media Player Class by calling its static create() method.
        Button buttonsong1 = (Button)findViewById(R.id.song1);
        mediaPlayer = MediaPlayer.create(this,R.raw.song1);
        mediaPlayer2 = MediaPlayer.create(this,R.raw.song2);
        //MediaPlayer mediaPlayer2 = MediaPlayer.create(R.raw.);
        buttonsong1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.start();
            }
        });
        Button pause1 = (Button)findViewById(R.id.pause1);
        pause1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.reset();
            }
        });
        Button buttonsong2 = (Button)findViewById(R.id.song2);
        buttonsong2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer2.start();
            }
        });
        Button pause2 = (Button)findViewById(R.id.pause2);
        pause2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer2.reset();
            }
        });
    }
}
