package com.example.mymediaplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mp = MediaPlayer.create(this, R.raw.song);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button3:
                mp.start();
            case R.id.button2:
                mp.stop();
            case R.id.button:
                mp.pause();
        }
    }


}