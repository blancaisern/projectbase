package com.iesemilidarder.bisern;

import com.iesemilidarder.bisern.data.Moto;
import com.iesemilidarder.bisern.data.Vehicle;

public class Launcher {
    public static void main (String... args) {
        try {
            System.out.println("Concesionario brumbrum App 2.0");
            Moto moto = new Moto ();
            moto.setNumWheels(9);
            moto.setPrice(123.45);
            moto.setColor("Blanco");
            System.out.println("Ruedas:"+moto.getNumWheels());
            moto.start();
            System.out.println("pista que voy!");
            moto.brake();
            Vehicle aux = new Moto ();
            SystemUtilHelper.consolePrint("yuhu");
        } catch (Exception e) {
                SystemUtilHelper.logError(e);
        }
    }
}
