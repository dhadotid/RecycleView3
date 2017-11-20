package com.rsypj.recyclerview3.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rsypj.recyclerview3.R;
import com.rsypj.recyclerview3.adapter.viewholder.MainActivityViewHolder;
import com.rsypj.recyclerview3.model.TodoModel;

import java.util.ArrayList;

/**
 * Created by dhadotid on 20/11/2017.
 */

public class MainActivityAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    Context context;
    ArrayList<TodoModel> data = new ArrayList<>();

    public MainActivityAdapter(Context context, ArrayList<TodoModel> data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof MainActivityViewHolder){
            ((MainActivityViewHolder) holder).setUpDataToUI(data.get(position));
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.custom_main, null);

        return new MainActivityViewHolder(v);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
