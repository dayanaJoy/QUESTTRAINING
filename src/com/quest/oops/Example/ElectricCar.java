package com.quest.oops.Example;

public class ElectricCar extends Vehicle implements Driving{
    private int batterycapacity;
    public ElectricCar(String color,int speed,int batterycapacity) {
        super(color,speed);
        this.batterycapacity = batterycapacity;
    }
    public int getBatterycapacity() {
        return batterycapacity;
    }
    public void setBatterycapacity(int batterycapacity) {
        this.batterycapacity = batterycapacity;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Batterycapacity: " + batterycapacity);
    }

    @Override
    public String toString() {
        return super.toString()+" ElectricCar [batterycapacity=" + batterycapacity + "]";
    }

    @Override
    public void drive() {
        System.out.println("Driving ElectricCar");
    }
}
