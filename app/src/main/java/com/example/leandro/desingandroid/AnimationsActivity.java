package com.example.leandro.desingandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class AnimationsActivity extends AppCompatActivity {

    @BindView(R.id.button1)
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animations);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.button1)
    public void getbutton1() {

        startActivity(new Intent(this, Slide1Activity.class));

    }
}