package com.quest.CaeStudy.BMWServices;

import java.time.LocalDateTime;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class CustomerManagement {
    public static void main(String[] args) {
        // Create customers
        ElectricVehicle electricVehicle = new ElectricVehicle("EV1", "BMW", "i3", 2020, 20000, "John", 40, 300);
        Customer customer1 = new Customer("C1", "John Doe", "john.doe@example.com", electricVehicle);
        CombustionEngineVehicle combustionEngineVehicle = new CombustionEngineVehicle("CEV1", "BMW", "X5", 2018, 55000, "Jane", "Petrol", 3.0);
        Customer customer2 = new Customer("C2", "Jane Doe", "jane.doe@example.com", combustionEngineVehicle);

        // Create service bookings
        ServiceBooking serviceBooking1 = new ServiceBooking("SB1", customer1, LocalDateTime.now(), "Battery Check", 50.0);
        ServiceBooking serviceBooking2 = new ServiceBooking("SB2", customer2, LocalDateTime.now(), "Oil Change", 75.0);

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
    }
}



