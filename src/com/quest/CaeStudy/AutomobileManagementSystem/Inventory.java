package com.quest.CaeStudy.AutomobileManagementSystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Inventory {

    static List<Vehicle> vehicles = new ArrayList<>();

    public Inventory() {
        vehicles.add(new Car("C1", "Toyota", "Corolla", 250000, LocalDate.of(2024, 5, 10), 5));
        vehicles.add(new Car("C2", "Honda", "Civic", 280000, LocalDate.of(2021, 8, 15), 5));
        vehicles.add(new Car("C3", "Ford", "Mustang", 550000, LocalDate.of(2022, 3, 20), 4));
        vehicles.add(new Bike("B1", "Yamaha", "R15", 150000, LocalDate.of(2019, 6, 5), 155));
        vehicles.add(new Bike("B2", "Suzuki", "Gixxer", 140000, LocalDate.of(2020, 11, 25), 155));
    }

    public  List<Vehicle> getVehicles() {
        return vehicles;
    }

    public static void setVehicles(List<Vehicle> vehicles) {
        Inventory.vehicles = vehicles;
    }

    //stream API and searching (brand)
    public void printVehiclesByBrand(String brand) throws Exception {
        boolean found = false;
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getBrand().equalsIgnoreCase(brand)) {
                System.out.println(vehicle);
                found = true;
            }
        }
        if (!found) {
            throw new Exception("Vehicle with the given brand not found.");
        }
    }

    public void printVehicles(){
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }

    public Vehicle printVehiclesById(String vehicleId) {
        return vehicles.stream()
                .filter(vehicle -> vehicle.getVehicleID().equalsIgnoreCase(vehicleId))
                .findFirst()
                .orElse(null);
    }
}
