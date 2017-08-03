package com.example.leandro.desingandroid.adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.leandro.desingandroid.R;
import com.example.leandro.desingandroid.model.Title;

import java.util.ArrayList;

/**
 * Created by Leandro on 8/3/17.
 */

public class TitleAdapter extends RecyclerView.Adapter<TitleAdapter.TitleHolder> {

    private ArrayList<Title> list;
    private Activity activity;

    public TitleAdapter(ArrayList<Title> list, Activity activity) {
        this.list = list;
        this.activity = activity;
    }

    @Override
    public TitleHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_title, parent, false);
        return new TitleHolder(view);
    }

    @Override
    public void onBindViewHolder(TitleHolder holder, int position) {

        holder.titleText.setText(list.get(position).getName());
        holder.conten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class TitleHolder extends RecyclerView.ViewHolder {

        LinearLayout conten;
        TextView titleText;

        public TitleHolder(View itemView) {
            super(itemView);

            titleText = (TextView) itemView.findViewById(R.id.title_text);
            conten = (LinearLayout) itemView.findViewById(R.id.conten);
        }
    }
}