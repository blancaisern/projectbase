package com.iesemilidarder.bisern.data;

import com.iesemilidarder.bisern.AppConstants;
import com.iesemilidarder.bisern.exception.IESMyException;

public abstract class Vehicle {
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private String color;
    private Integer numWheels;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(Integer numWheels) {
        if(numWheels == null || numWheels > AppConstants.MAX_WHEELS) {
            throw new IESMyException("Demasiadas ruedas nen!");
        }
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