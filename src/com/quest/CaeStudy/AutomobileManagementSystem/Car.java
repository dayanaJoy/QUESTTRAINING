package com.quest.CaeStudy.AutomobileManagementSystem;

import java.time.LocalDate;

public class Car extends Vehicle {
    private int seatingCapacity;

    public Car(String vehicleID, String brand, String model, double price, LocalDate manufacturedate, int seatingCapacity) {
        super(vehicleID, brand, model, price, manufacturedate);
        this.seatingCapacity = seatingCapacity;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + "Car{" + "seatingCapacity=" + seatingCapacity + '}';
    }
}

