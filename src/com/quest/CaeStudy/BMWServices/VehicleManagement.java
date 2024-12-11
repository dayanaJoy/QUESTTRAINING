package com.quest.CaeStudy.BMWServices;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class VehicleManagement {
    public static void main(String[] args) {
        //create vehicle
        ElectricVehicle electricVehicle = new ElectricVehicle("EV1", "BMW", "i3", 2020, 20000, "John", 40, 300);
        CombustionEngineVehicle combustionEngineVehicle = new CombustionEngineVehicle("CEV1", "BMW", "X5", 2018, 55000, "Jane", "Petrol", 3.0);
        //service centers
        ServiceCenter<ElectricVehicle> electricVehicleServiceCenter = new ServiceCenter<>();
        electricVehicleServiceCenter.addServicedVehicle(electricVehicle);
        ServiceCenter<CombustionEngineVehicle> combustionEngineVehicleServiceCenter = new ServiceCenter<>();
        combustionEngineVehicleServiceCenter.addServicedVehicle(combustionEngineVehicle);
        //predicate
        Predicate<Vehicle> mileagePredicate = vehicle -> vehicle.getMileage() > 50000;
        Predicate<Vehicle> yearPredicate = vehicle -> vehicle.getYear() < 2015;

        List<Vehicle> allvehicles = Arrays.asList(electricVehicle, combustionEngineVehicle);

        System.out.println("Vehicles with mileage > 50,000 : ");
        allvehicles.stream()
                .filter(mileagePredicate)
                .forEach(System.out::println);

        System.out.println("Vehicles manufactured before 2015:");
        allvehicles.stream()
                .filter(yearPredicate)
                .forEach(System.out::println);
        //consumer
        Consumer<Vehicle> vehicleConsumer = vehicle -> System.out.println("VIN: " + vehicle.getVin() + ", Mileage: " + vehicle.getMileage());
        allvehicles.stream()
                .forEach(vehicleConsumer);
        // Supplier
        Supplier<Vehicle> vehicleSupplier = () -> {
            Random random = new Random();
            return random.nextBoolean()?electricVehicle:combustionEngineVehicle;
        };
        System.out.println("Random vehicle:");
        System.out.println(vehicleSupplier.get());
        // Function
        Function<Vehicle, Double> resaleValueFunction = vehicle -> {
            double originalPrice = 50000;
            double depreciationRate = 0.1;
            int yearsUsed = vehicle.getYear() - 2020;
            return originalPrice - (depreciationRate * yearsUsed);
        };

        System.out.println("Resale value of vehicle:");
        System.out.println(resaleValueFunction.apply(electricVehicle));
        //Stream API to find oldest vehicle
        Vehicle oldestVehicle = allvehicles.stream()
                .min(Comparator.comparingInt(Vehicle::getYear))
                .get();
        System.out.println("Oldest vehicle:");
        System.out.println(oldestVehicle);

        //Stream API to group vehicles by type
        Map<String, Integer> vehicleCountByType = allvehicles.stream()
                .collect(Collectors.groupingBy(vehicle -> vehicle instanceof ElectricVehicle ? "Electric" : "Combustion",
                        Collectors.summingInt(value -> 1)));
        System.out.println("Vehicle count by type:");
        System.out.println(vehicleCountByType);

    }
}


