package com.example.audioplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
 Button buttonStart,buttonStop,buttonPause;
 MediaPlayer mediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonStart=findViewById(R.id.buttonStart);
        buttonStop=findViewById(R.id.buttonStop);
        buttonPause=findViewById(R.id.buttonPause);

        mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.mysong1);
        mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.mysong2);

        buttonStart.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.buttonStart:
                mediaPlayer.start();

                break;
            case R.id.buttonPause:
                mediaPlayer.pause();
                break;
            case R.id.buttonStop:
                mediaPlayer.pause();
                break;
        }
    }
}
