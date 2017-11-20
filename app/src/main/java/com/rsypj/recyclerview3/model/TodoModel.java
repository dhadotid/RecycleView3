package com.rsypj.recyclerview3.model;

/**
 * Created by dhadotid on 20/11/2017.
 */

public class TodoModel {

    int id;
    String todo;
    String tanggal;

    public TodoModel(int id, String todo, String tanggal) {
        this.id = id;
        this.todo = todo;
        this.tanggal = tanggal;
    }

    public int getId() {
        return id;
    }

    public String getTodo() {
        return todo;
    }

    public String getTanggal() {
        return tanggal;
    }
}
