package com.example.leandro.desingandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Slide1Activity extends AppCompatActivity {

    @BindView(R.id.button)
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide1);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.button)
    public void getButton() {
        startActivity(new Intent(this, Slide2Activity.class));
        overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left);
    }
}
