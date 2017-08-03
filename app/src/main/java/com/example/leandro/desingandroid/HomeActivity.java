package com.example.leandro.desingandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class HomeActivity extends AppCompatActivity {

    @BindView(R.id.button_lottie)
    Button buttonLottie;

    @BindView(R.id.button_discreteScrollView)
    Button buttonDiscreteScrollView;

    @BindView(R.id.button_Sound)
    Button buttonSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.button_lottie)
    public void getLottie() {
        startActivity(new Intent(this, LottieActivity.class));
    }

    @OnClick(R.id.button_discreteScrollView)
    public void getDiscrete() {
        startActivity(new Intent(this, AnimationsActivity.class));
    }

    @OnClick(R.id.button_Sound)
    public void getSound() {
        startActivity(new Intent(this, SoundActivity.class));
    }
}