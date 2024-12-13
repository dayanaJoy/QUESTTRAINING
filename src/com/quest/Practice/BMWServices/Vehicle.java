package com.quest.Practice.BMWServices;

public class Vehicle {
    private String vin;
    private String brand;
    private String model;
    private int year;
    private double mileage;
    private String ownerName;

    public Vehicle(String vin, String brand, String model, int year, double mileage, String ownerName) {
        this.vin = vin;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.ownerName = ownerName;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownername) {
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vin = '" + vin + '\'' +
                ", brand = '" + brand + '\'' +
                ", model = '" + model + '\'' +
                ", year = " + year +
                ", mileage = " + mileage +
                ", ownerName = '" + ownerName + '\'' +
                '}';
    }
}
