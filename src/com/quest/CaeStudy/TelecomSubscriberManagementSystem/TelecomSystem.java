package com.quest.CaeStudy.TelecomSubscriberManagementSystem;

import java.io.*;
import java.util.*;

public class TelecomSystem implements Telecom{

    private ArrayList<Subscriber> subscribers = new ArrayList<>();
    private ArrayList<List<CallHistory>> callHistory = new ArrayList<>();

    // Add new subscriber
    @Override
    public void addSubscriber(int id, String name, String phoneNumber, String planType, double balance) {
            for (Subscriber subscriber : subscribers) {
                if (subscriber.getId() == id) {
                    System.out.println("Subscriber with this ID already exists.");
                    return;
                }
            }
            Subscriber subscriber = new Subscriber(id, name, phoneNumber, planType, balance);
            subscribers.add(subscriber);
            callHistory.add(new ArrayList<>());
            System.out.println("Subscriber added successfully.");

    }

    // Update balance for prepaid subscribers
    @Override
    public void updateBalance(int id, double amount) {
        for (Subscriber subscriber : subscribers) {
            if (subscriber.getId() == id && subscriber.getPlanType().equalsIgnoreCase("Prepaid")) {
                subscriber.updateBalance(amount);
                System.out.println("Balance updated successfully.");
                return;
            }
        }
        System.out.println("Subscriber not found or not a prepaid plan.");
    }

    // List all subscribers
    @Override
    public void listSubscribers() {
        if (subscribers.isEmpty()) {
            System.out.println("No subscribers found.");
        } else {
            for (Subscriber subscriber : subscribers) {
                System.out.println(subscriber);
            }
        }
    }

    // Record a call for a subscriber
    @Override
    public void recordCall(int subscriberId, String callType, int duration, String timestamp) {
        for (Subscriber subscriber : subscribers) {
            if (subscriber.getId() == subscriberId) {
                int i = subscribers.indexOf(subscriber);
                CallHistory record = new CallHistory(callType, duration, timestamp);
                callHistory.get(i).add(record);
                System.out.println("Call recorded successfully.");
                return;
            }
        }
        System.out.println("Subscriber not found.");
    }

    // Display call history for a subscriber
    @Override
    public void displayCallHistory(int subscriberId) {
        for (int i = 0; i < subscribers.size(); i++) {
            if (subscribers.get(i).getId() == subscriberId) {
                List<CallHistory> records = callHistory.get(i);
                if (records.isEmpty()) {
                    System.out.println("No call records found for this subscriber.");
                } else {
                    for (CallHistory record : records) {
                        System.out.println(record);
                    }
                }
                return;
            }
        }
        System.out.println("Subscriber not found.");
    }

    // Generate bill for a postpaid subscriber
    @Override
    public void generateBill(int subscriberId) {
        for (int i = 0; i < subscribers.size(); i++) {
            Subscriber subscriber = subscribers.get(i);
            if (subscriber.getId() == subscriberId && subscriber.getPlanType().equalsIgnoreCase("Postpaid")) {
                double totalAmount = 0;
                List<CallHistory> records = callHistory.get(i);
                if (records != null) {
                    for (CallHistory record : records) {
                        int duration = record.getDuration();
                        switch (record.getCallType().toUpperCase()) {
                            case "LOCAL":
                                totalAmount += duration * 1;
                                break;
                            case "STD":
                                totalAmount += duration * 2;
                                break;
                            case "ISD":
                                totalAmount += duration * 5;
                                break;
                        }
                    }
                }
                System.out.println("Total Bill for Subscriber " + subscriber.getName() + ": ₹" + totalAmount);
                return;
            }
        }
        System.out.println("Bill generation is only for postpaid subscribers.");
    }

    //save data
    @Override
    public void saveData() {
        try{
            ObjectOutputStream SubscriberStream = new ObjectOutputStream(new FileOutputStream("Subcriber.txt"));
            ObjectOutputStream CallHistoryStream = new ObjectOutputStream(new FileOutputStream("CallHistory.txt"));
            SubscriberStream.writeObject(subscribers);
            CallHistoryStream.writeObject(callHistory);
            System.out.println("Data saved successfully.");
        } catch (FileNotFoundException e) {
            System.out.println("File not found. "+e.getMessage());
        } catch (IOException e) {
            System.out.println("Error. "+e.getMessage());
        }
    }

    //Load data
    @Override
    public void loadData() {
        try{
            ObjectInputStream SubscriberStream = new ObjectInputStream(new FileInputStream("Subcriber.txt"));
            ObjectInputStream CallHistoryStream = new ObjectInputStream(new FileInputStream("CallHistory.txt"));
            SubscriberStream.readObject();
            CallHistoryStream.readObject();
            System.out.println("Data loaded successfully.");
        } catch (FileNotFoundException e) {
            System.out.println("File not found. "+e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Error. "+e.getMessage());
        } catch (IOException e) {
            System.out.println("Error. "+e.getMessage());
        }
    }
}
