package com.rsypj.recyclerview3.adapter.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.rsypj.recyclerview3.R;
import com.rsypj.recyclerview3.model.TodoModel;

/**
 * Created by dhadotid on 20/11/2017.
 */

public class MainActivityViewHolder extends RecyclerView.ViewHolder {


    TextView tvTodo;
    TextView tvTanggal;

    public MainActivityViewHolder(View view) {
        super(view);

        tvTodo = (TextView)view.findViewById(R.id.custom_main_tvTodo);
        tvTanggal = (TextView)view.findViewById(R.id.custom_main_tvTanggal);

    }

    public void setUpDataToUI(TodoModel data){
        tvTodo.setText("" + data.getTodo());
        tvTanggal.setText("Tanggal: " + data.getTanggal());
    }
}
