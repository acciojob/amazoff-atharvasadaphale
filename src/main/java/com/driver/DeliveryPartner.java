package com.driver;

public class DeliveryPartner {


    private int id;
    private int numberOfOrders;

    public DeliveryPartner(int id) {
        this.id = id;
        this.numberOfOrders = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getNumberOfOrders(){
        return numberOfOrders;
    }

    public void setNumberOfOrders(Integer numberOfOrders) {
        this.numberOfOrders = numberOfOrders;
    }
}