package com.quest.CaeStudy.AutomobileManagementSystem;

import java.io.Serializable;
import java.time.LocalDate;


public class Vehicle implements Cloneable, Serializable {
    private String vehicleID;
    private String brand;
    private String model;
    private double price;
    private LocalDate manufacturedate;

    public Vehicle(String vehicleID, String brand, String model, double price, LocalDate manufacturedate) {
        this.vehicleID = vehicleID;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.manufacturedate = manufacturedate;
    }

    public String getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(String vehicleID) {
        this.vehicleID = vehicleID;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getManufacturedate() {
        return manufacturedate;
    }

    public void setManufacturedate(LocalDate manufacturedate) {
        this.manufacturedate = manufacturedate;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleID='" + vehicleID + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", manufacturedate=" + manufacturedate +
                '}';
    }
    @Override
    public Vehicle clone() throws CloneNotSupportedException {
        Vehicle clone = (Vehicle) super.clone();
        clone.setPrice(clone.getPrice()*0.1);
        return clone;
    }

}
