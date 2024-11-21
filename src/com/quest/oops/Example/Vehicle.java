package com.quest.oops.Example;

public class Vehicle {
    private String color;
    private int speed;
    //default constructor
    public Vehicle() {
        this.color = "Black";
        this.speed = 120;
    }
    //parametrised constructor
    public Vehicle(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void displayDetails() {
        System.out.println("Color: " + color);
        System.out.println("Speed: " + speed);
    }

    @Override
    public String toString() {
        return "Vehicle [color=" + color + ", speed=" + speed + "]";
    }
}

