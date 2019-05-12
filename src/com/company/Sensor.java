package com.company;

import java.util.ArrayList;
import java.util.List;

public class Sensor<T> {

    private String location;
    private double currentValue;
    private double previousValue;
    private boolean state;
    private List<Double> dataList;
    private Thermometer thermometer;

    public Sensor() {
        this.currentValue = 0;
        this.previousValue = 0;
        this.state = true;
        this.dataList = new ArrayList<Double>();
        this.thermometer = new Thermometer();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getCurrentValue(Double value) {
        if (state) {
            dataList.add(value);
            return currentValue;
        } else {
            System.out.println("Thermometer is switched off");
        }
        return 0;
    }

    public void setCurrentValue(double currentValue) {
        this.currentValue = currentValue;
    }

    public double getPreviousValue() {
        return previousValue;
    }

    public void setPreviousValue(double previousValue) {
        this.previousValue = previousValue;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public List<Double> getDataList() {
        return dataList;
    }

    public void setDataList(List<Double> dataList) {
        this.dataList = dataList;
    }
}

