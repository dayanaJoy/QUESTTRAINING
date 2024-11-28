package com.quest.CaeStudy.TelecomSubscriberManagementSystem;

import java.io.Serializable;
public class Subscriber implements Serializable {
    private int id;
    private String name;
    private String phoneNumber;
    private String planType;
    private double balance;

    public Subscriber(int id, String name, String phoneNumber, String planType, double balance) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.planType = planType;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPlanType() {
        return planType;
    }

    public double getBalance() {
        return balance;
    }

    public void updateBalance(double amount) {
        if (this.planType.equalsIgnoreCase("Postpaid")) {
            this.balance += amount;
        }
    }

    @Override
    public String toString() {
        return "Subscriber{" +
                "subscriberID=" + id +
                ", subscriberName='" + name + '\'' +
                ", phonenumber=" + phoneNumber +
                ", plan='" + planType + '\'' +
                ", balance=" + balance +
                '}';
    }
}
