package com.test.entity;

public class Order {
    private long order_id;
    private int price;
    private long user_id;
    private int status;

    public Order() {
    }

    public Order(int price, long user_id, int status) {
        this.price = price;
        this.user_id = user_id;
        this.status = status;
    }

    public Order(long order_id, int price, long user_id, int status) {
        this.order_id = order_id;
        this.price = price;
        this.user_id = user_id;
        this.status = status;
    }

    public long getOrder_id() {
        return order_id;
    }

    public void setOrder_id(long order_id) {
        this.order_id = order_id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
