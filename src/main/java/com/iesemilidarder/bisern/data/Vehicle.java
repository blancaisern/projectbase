package com.iesemilidarder.bisern.data;

import com.sun.javafx.image.IntPixelGetter;

public abstract class Vehicle {
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private String color;
    private Integer numWheels;

    public Integer getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(Integer numWheels) {
        this.numWheels = numWheels;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    private Double price;


    public abstract void start ();

    public void brake() {
        doLog("he frenado");
    }

    protected void doLog(String message) {
        System.out.println(message);
    }
    private String showLog(String message){
        doLog(message);
        return(message);
    }
}