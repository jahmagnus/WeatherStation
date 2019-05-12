package com.company;

import java.util.ArrayList;

public class SensorUnit<T extends Sensor> {

    private String brand;
    private String size;
    private Sensor sensor;

    public SensorUnit(String brand, String size, Sensor sensor) {
        this.brand = "Dough-Boy";
        this.size = "Large";
        this.sensor = new Sensor();
    }
}





