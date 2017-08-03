package com.example.leandro.desingandroid;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SoundActivity extends AppCompatActivity {

    @BindView(R.id.button1)
    Button button1;

    @BindView(R.id.button2)
    Button button2;

    @BindView(R.id.button3)
    Button button3;

    @BindView(R.id.button4)
    Button button4;

    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sound);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.button1)
    public void getButton1() {
        player = MediaPlayer.create(this, R.raw.complete1);
        player.start();
    }

    @OnClick(R.id.button2)
    public void getButton2() {
        player = MediaPlayer.create(this, R.raw.success2);
        player.start();
    }

    @OnClick(R.id.button3)
    public void getButton3() {
        player = MediaPlayer.create(this, R.raw.cancel3);
        player.start();

    }

    @OnClick(R.id.button4)
    public void getButton4() {
        player = MediaPlayer.create(this, R.raw.notification4);
        player.start();
    }
}
