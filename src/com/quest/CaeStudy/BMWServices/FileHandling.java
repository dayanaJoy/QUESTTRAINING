package com.quest.CaeStudy.BMWServices;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileHandling {

    public static void writeReportToFile(Map<Customer, List<ServiceBooking>> customerBookings, String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            double totalRevenue = 0;
            Map<String, Integer> serviceCounts = new HashMap<>();

            for (List<ServiceBooking> bookings : customerBookings.values()) {
                for (ServiceBooking booking : bookings) {
                    totalRevenue += booking.getCost();
                    serviceCounts.put(booking.getServiceType(),
                            serviceCounts.getOrDefault(booking.getServiceType(), 0) + 1);
                }
            }

            writer.write("Total Revenue: " + totalRevenue);
            writer.newLine();
            writer.write("Service Counts:");
            writer.newLine();
            for (Map.Entry<String, Integer> entry : serviceCounts.entrySet()) {
                writer.write(entry.getKey() + ": " + entry.getValue());
                writer.newLine();
            }

            System.out.println("Report written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readReportFromFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
