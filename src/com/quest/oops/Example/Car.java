package com.quest.oops.Example;

public class Car extends Vehicle {
    private int noOfSeats;

    public Car() {
        super();
        this.noOfSeats = 4;
    }
    public Car(String color,int speed,int noOfSeats) {
        super(color,speed);
        this.noOfSeats = noOfSeats;
    }
    public int getNoOfSeats() {
        return noOfSeats;
    }
    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("No. of Seats: " + noOfSeats);
    }

    @Override
    public String toString() {
        return super.toString() + "Car{" + " NoOfSeats=" + noOfSeats + '}';
    }
}
