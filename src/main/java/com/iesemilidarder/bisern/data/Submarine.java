package com.iesemilidarder.bisern.data;

public class Submarine extends WaterCraft implements IDive{

    public void goDeeper() {

    }

    public void goSurface() {

    }

    @Override
    public void doFloat() {
        super.doFloat();
        System.out.println("Floto, pero tambien me piro!");
    }
}
