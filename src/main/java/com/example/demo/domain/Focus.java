package com.example.demo.domain;



public class Focus {
    private int id;
    private int goods_id;
    private int user_id;

    public int getId() {
        return id;
    }

    public int getGoods_id() {
        return goods_id;
    }

    public int getUser_id() {
        return user_id;
    }

    @Override
    public String toString() {
        return "Focus{" +
                "id=" + id +
                ", goods_id=" + goods_id +
                ", user_id=" + user_id +
                '}';
    }
}
