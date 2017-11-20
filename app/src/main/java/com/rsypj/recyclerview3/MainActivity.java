package com.rsypj.recyclerview3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.rsypj.recyclerview3.adapter.MainActivityAdapter;
import com.rsypj.recyclerview3.model.TodoModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView listTodo;
    MainActivityAdapter adapter;

    ArrayList<TodoModel> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listTodo = (RecyclerView)findViewById(R.id.activity_main_rlv);

        setAdapter();
        dataDummy();
    }

    private void setAdapter(){
        adapter = new MainActivityAdapter(this, data);

        listTodo.setItemAnimator(new DefaultItemAnimator());
        listTodo.setLayoutManager(new LinearLayoutManager(this));
        listTodo.setAdapter(adapter);
    }

    private void dataDummy(){
        data.add(new TodoModel(1, "Mau ngapain kita hari ini?", "20-November-2017"));
        data.add(new TodoModel(1, "Mau makan nanti", "20-November-2017"));
        data.add(new TodoModel(1, "Mau tidur", "20-November-2017"));
    }
}
