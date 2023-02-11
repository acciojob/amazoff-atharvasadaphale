package com.driver;

public class Order {

    private int id;
    private int deliveryTime;

    public Order(int id, int deliveryTime) {
        this.id = id;
        this.deliveryTime = deliveryTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(int deliveryTime) {
        this.deliveryTime = deliveryTime;
    }
}
