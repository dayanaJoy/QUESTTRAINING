package com.quest.CaeStudy.AutomobileManagementSystem;

import java.io.*;
import java.util.*;

public class main {
    public static void main(String[] args) throws VehicleNotAvailableException {
        Scanner sc = new Scanner(System.in);
        Inventory inventory = new Inventory();
        Map<Customer, Set<Vehicle>> customerVehicleMap = new HashMap<>();
        boolean isAvailable = true;

        //search vehicle by brand
            System.out.println("Vehicle by brand  : ");
            String brand = sc.nextLine();
            try {
                inventory.printVehiclesByBrand(brand);
            } catch (Exception e) {
                System.out.println("Vehicle with the given brand not found : \n Enter a valid brand : ");
                brand = sc.nextLine();
                try {
                    inventory.printVehiclesByBrand(brand);
                }catch (Exception e1) {
                    e1.printStackTrace();
                }
            }

            //  customer details
            while (true) {
                System.out.print("Enter Customer ID: ");
                String customerID = sc.nextLine();
                System.out.print("Enter Customer Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Customer Email: ");
                String email = sc.nextLine();
                Customer customer = new Customer(customerID, name, email);
                // Display customer info
                System.out.println("\nCustomer Info: " + customer);

                // Displaying available vehicles
                while (isAvailable) {
                    System.out.println("\nAvailable Vehicles:");
                    for (Vehicle vehicle : inventory.getVehicles()) {
                        System.out.println(vehicle);
                    }

                    System.out.print("\nEnter Vehicle ID to purchase: ");
                    String vehicleID = sc.nextLine();
                    Vehicle vehicle = inventory.printVehiclesById(vehicleID);
                    if (vehicle != null) {
                        customer.addPurchasedVehicle(vehicle);
                        inventory.getVehicles().remove(vehicle); // Removing vehicle from inventory after purchase
                        System.out.println("Vehicle Purchased: " + vehicle);
                    } else {
                        System.out.println("Vehicle not found");
                        throw new VehicleNotAvailableException("Vehicle not available");
                    }
                    System.out.println("\nDo you want to purchase another vehicle? (Y/N)");
                    String answer = sc.nextLine();
                    if (answer.equalsIgnoreCase("N")) {
                        isAvailable = false;
                    }
                }
                //Map to store customer and purchased vehicle
                Set<Vehicle> purchasedVehicles = new HashSet<>();
                purchasedVehicles.addAll(customer.getPurchasedVehicles());
                customerVehicleMap.put(customer, purchasedVehicles);
        /*Map<Customer, Set<Vehicle>> customerVehicles = new HashMap<>();
        customerVehicles.put(customer, new HashSet<>());*/
                //serialization
                try {
                    ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("salesdata.ser"));
                    oos.writeObject(customerVehicleMap);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                //Deserialization
                try {
                    ObjectInputStream ois = new ObjectInputStream(new FileInputStream("salesdata.ser"));
                    customerVehicleMap = (Map<Customer, Set<Vehicle>>) ois.readObject();
                    ois.readObject();
                    System.out.print("Enter Customer ID to see the purchased vehicles: ");
                    String customerIdToCheck = sc.nextLine();
                    customerVehicleMap.forEach((cust, vehicles) -> {
                        if (cust.getCustomerID().equals(customerIdToCheck)) {
                            System.out.println(cust.getName() + " purchased the following vehicles:");
                            vehicles.forEach(vehicle -> System.out.println(vehicle));
                        }
                    });
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                // Show all purchased vehicles sorted by price in descending order
                System.out.println("\nPurchased Vehicles by Price (Descending):");
                customerVehicleMap.forEach((cust, vehicles) -> {
                    System.out.println("\nCustomer: " + cust.getName());
                    vehicles.stream()
                            .sorted(Comparator.comparing(Vehicle::getPrice).reversed())
                            .forEach(vehicle -> System.out.println(vehicle));
                });
            }
        }

}



