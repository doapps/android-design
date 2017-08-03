package com.example.leandro.desingandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.leandro.desingandroid.adapter.TitleAdapter;
import com.example.leandro.desingandroid.model.Title;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AnimationsActivity extends AppCompatActivity {

    @BindView(R.id.list_recycler)
    RecyclerView list_recycler;

    private TitleAdapter titleAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animations);

        ButterKnife.bind(this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        list_recycler.setLayoutManager(linearLayoutManager);

        titleAdapter = new TitleAdapter(getListTitle(), this);
        list_recycler.setAdapter(titleAdapter);

    }

    private ArrayList<Title> getListTitle() {
        ArrayList<Title> list = new ArrayList<>();

        list.add(new Title(1, "transaciones"));
        list.add(new Title(2, "detalles"));

        return list;
    }
}