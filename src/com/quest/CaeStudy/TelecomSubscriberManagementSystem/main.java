package com.quest.CaeStudy.TelecomSubscriberManagementSystem;

import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        TelecomSystem system = new TelecomSystem();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nTelecom System Menu:");
            System.out.println("1. Add Subscriber");
            System.out.println("2. Update Balance (Prepaid)");
            System.out.println("3. List Subscribers");
            System.out.println("4. Record Call");
            System.out.println("5. Display Call History");
            System.out.println("6. Generate Bill (Postpaid)");
            System.out.println("7. Save Data");
            System.out.println("8. Load Data");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    try {
                        System.out.print("Enter Subscriber ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();  // consume newline
                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter Phone Number: ");
                        String phoneNumber = sc.nextLine();
                        System.out.print("Enter Plan Type (Prepaid/Postpaid): ");
                        String planType = sc.nextLine();
                        System.out.print("Enter Balance: ");
                        double balance = sc.nextDouble();
                        system.addSubscriber(id, name, phoneNumber, planType, balance);
                    }catch (InputMismatchException e) {
                        System.out.println("InputMismatchException  "+e.getMessage());
                        sc.nextLine();
                    }
                        break;
                case 2:
                    System.out.print("Enter Subscriber ID: ");
                    int prepaidId = sc.nextInt();
                    System.out.print("Enter Amount to Add: ");
                    double amount = sc.nextDouble();
                    system.updateBalance(prepaidId, amount);
                    break;
                case 3:
                    system.listSubscribers();
                    break;
                case 4:
                    try {
                        System.out.print("Enter Subscriber ID: ");
                        int callSubscriberId = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Call Type (LOCAL/STD/ISD): ");
                        String callType = sc.nextLine();
                        System.out.print("Enter Call Duration (minutes): ");
                        int duration = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Call Date (YYYY-MM-DD): ");
                        String timestamp = sc.nextLine();
                        system.recordCall(callSubscriberId, callType, duration, timestamp);
                    }catch (InputMismatchException e) {
                        System.out.println("InputMismatchException  "+e.getMessage());
                        sc.nextLine();
                    }
                    break;
                case 5:
                    try {
                        System.out.print("Enter Subscriber ID: ");
                        int historyId = sc.nextInt();
                        system.displayCallHistory(historyId);
                    }catch (InputMismatchException e) {
                        System.out.println("InputMismatchException  "+e.getMessage());
                        sc.nextLine();
                    }
                    break;
                case 6:
                    try {
                        System.out.print("Enter Subscriber ID: ");
                        int billId = sc.nextInt();
                        system.generateBill(billId);
                    }catch (InputMismatchException e) {
                        System.out.println("InputMismatchException  "+e.getMessage());
                        sc.nextLine();
                    }
                    break;
                case 7:
                    system.saveData();
                    break;
                case 8:
                    system.loadData();
                    break;
                case 9:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }
        } while (choice != 9);
        sc.close();
    }
}

