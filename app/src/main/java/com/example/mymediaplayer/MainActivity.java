package com.example.mymediaplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import java.io.IOException;

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
            case R.id.btnPlay:
                if (!mp.isPlaying()) {
                    mp.start();
                    break;
                }
            case R.id.btnStop:
                mp.stop();
                try {
                    mp.prepare();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case R.id.btnPause:
                mp.pause();
                break;
        }
    }


}