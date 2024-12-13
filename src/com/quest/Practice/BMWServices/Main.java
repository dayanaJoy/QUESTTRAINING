package com.quest.Practice.BMWServices;

import java.io.*;
import java.time.LocalDateTime;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //create vehicle
        ElectricVehicle electricVehicle = new ElectricVehicle("EV1", "BMW", "i3", 2020, 20000, "John", 40, 300.0);

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
            return random.nextBoolean() ? electricVehicle : combustionEngineVehicle;
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


        // ElectricVehicle electricVehicle = new ElectricVehicle("EV1", "BMW", "i3", 2020, 20000, "John", 40, 300);
        Customer customer1 = new Customer("C1", "John Doe", "john.doe@example.com", electricVehicle);
        // CombustionEngineVehicle combustionEngineVehicle = new CombustionEngineVehicle("CEV1", "BMW", "X5", 2018, 55000, "Jane", "Petrol", 3.0);
        Customer customer2 = new Customer("C2", "Jane Doe", "jane.doe@example.com", combustionEngineVehicle);

        // Create service bookings
        ServiceBooking serviceBooking1 = new ServiceBooking("SB1", customer1, LocalDateTime.now(), "Battery Check", 50.0);
        ServiceBooking serviceBooking2 = new ServiceBooking("SB2", customer2, LocalDateTime.now(), "Oil Change", 75.0);
        ServiceBooking serviceBooking3 = new ServiceBooking("SB3", customer1, LocalDateTime.now(), "Tire Rotation", -100.0); // Invalid cost


        // Map bookings to customers
        Map<Customer, List<ServiceBooking>> customerBookings = new HashMap<>();
        customerBookings.put(customer1, Arrays.asList(serviceBooking1));
        customerBookings.put(customer2, Arrays.asList(serviceBooking2));

        // Predicate: Check if a service booking is scheduled within the next 7 days.
        Predicate<ServiceBooking> serviceBookingPredicate = booking -> booking.getServiceDate().isBefore(LocalDateTime.now().plusDays(7));
        System.out.println("Upcoming bookings:");
        for (Map.Entry<Customer, List<ServiceBooking>> entry : customerBookings.entrySet()) {
            for (ServiceBooking booking : entry.getValue()) {
                if (serviceBookingPredicate.test(booking)) {
                    System.out.println(booking);
                }
            }

            // Consumer: Print a detailed invoice for a customer, including their bookings and total cost
            Consumer<Customer> invoiceConsumer = customer -> {
                System.out.println("Invoice for " + customer.getName());
                double totalCost = 0.0;
                for (ServiceBooking booking : customerBookings.get(customer)) {
                    totalCost += booking.getCost();
                }
                System.out.println("Total cost: " + totalCost);

                for (ServiceBooking booking : customerBookings.get(customer)) {
                    System.out.println(booking);
                }
            };
            invoiceConsumer.accept(customer1);


            //Function: Apply a 15% discount for customers with more than 3 services
            Function<Customer, Double> discountFunction = customer -> {
                double totalCost = 0.0;
                for (ServiceBooking booking : customerBookings.get(customer)) {
                    totalCost += booking.getCost();
                }
                if (customerBookings.get(customer).size() > 3) {
                    return totalCost * 0.15;
                } else {
                    return 0.0;
                }
            };

            System.out.println("Discount for " + customer1.getName() + ": " + discountFunction.apply(customer1));

            // Supplier: Generate a random service booking for testing purposes.
            Supplier<Customer> randomBookingSupplier = () -> {
                Random random = new Random();
                return random.nextBoolean() ? customer1 : customer2;
            };

               /* String bookingId = "SB" + random.nextInt(10);
                LocalDateTime serviceDate = LocalDateTime.now().plusDays(random.nextInt(30));
                String serviceType = random.nextBoolean() ? "Battery Check" : "Oil Change";
                double cost = random.nextDouble() * 100;
                return new ServiceBooking(bookingId, randomCustomer, serviceDate, serviceType, cost);*/


            System.out.println("Random service booking:");
            System.out.println(randomBookingSupplier.get());
        }

        // Serialization: Save the customer bookings to a file
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("serviceData.ser"))) {
            oos.writeObject(customerBookings);
            System.out.println("Customer bookings serialized to serviceData.ser");
        } catch (IOException e) {
            System.err.println("Error during serialization: " + e.getMessage());
        }

        // Deserialization: Read the customer bookings back from the file
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("serviceData.ser"))) {
            Map<Customer, List<ServiceBooking>> deserializedBookings = (Map<Customer, List<ServiceBooking>>) ois.readObject();
            System.out.println("Deserialized customer bookings:");
            deserializedBookings.forEach((customer, bookings) -> {
                System.out.println(customer.getName() + "'s bookings: " + bookings);
            });
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error during deserialization: " + e.getMessage());
        }

        // Cloneable: Clone a service booking
        try {
            ServiceBooking clonedServiceBooking = (ServiceBooking) serviceBooking1.clone();
            System.out.println("Cloned service booking:");
            System.out.println(clonedServiceBooking);
        } catch (CloneNotSupportedException e) {
            System.err.println("Error during cloning: " + e.getMessage());
        }


        // File handling for reports
        String reportFileName = "serviceReports.txt";
        try (PrintWriter writer = new PrintWriter(new FileWriter(reportFileName))) {
            // Total revenue generated from all services
            double totalRevenue = customerBookings.values().stream()
                    .flatMap(List::stream)
                    .mapToDouble(ServiceBooking::getCost)
                    .sum();
            writer.println("Total Revenue: " + totalRevenue);

            // Count of each type of service
            Map<String, Long> serviceTypeCounts = customerBookings.values().stream()
                    .flatMap(List::stream)
                    .collect(Collectors.groupingBy(ServiceBooking::getServiceType, Collectors.counting()));
            writer.println("Service Counts:");
            serviceTypeCounts.forEach((serviceType, count) -> writer.println(serviceType + ": " + count));

            System.out.println("Service report generated in " + reportFileName);
        } catch (IOException e) {
            System.err.println("Error writing report: " + e.getMessage());
        }

        // Read and display the report file
        try (BufferedReader reader = new BufferedReader(new FileReader(reportFileName))) {
            System.out.println("Service report contents:");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading report: " + e.getMessage());
        }
    }
}
