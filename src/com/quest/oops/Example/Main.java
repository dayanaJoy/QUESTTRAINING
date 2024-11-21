package com.quest.oops.Example;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle();
        vehicle1.displayDetails();
        Vehicle vehicle2 = new Vehicle("Yellow",90);
        vehicle2.displayDetails();
        System.out.println(vehicle1.toString());
        System.out.println(vehicle2.toString());
        System.out.println();

        Car car1 = new Car("Red",180,4);
        car1.displayDetails();
        Car car2 = new Car();
        car2.displayDetails();
        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println();

        ElectricCar electricCar = new ElectricCar("Blue",200,80);
        electricCar.displayDetails();
        System.out.println(electricCar.toString());
        electricCar.drive();

    }
}
