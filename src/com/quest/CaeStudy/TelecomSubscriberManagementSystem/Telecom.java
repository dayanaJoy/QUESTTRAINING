package com.quest.CaeStudy.TelecomSubscriberManagementSystem;

public interface Telecom {
    public void addSubscriber(int id, String name, String phoneNumber, String planType, double balance) ;
    public void updateBalance(int id, double amount);
    public void listSubscribers();
    public void recordCall(int subscriberId, String callType, int duration, String timestamp);
    public void displayCallHistory(int subscriberId);
    public void generateBill(int subscriberId);
    public void saveData();
    public void loadData();
    }
