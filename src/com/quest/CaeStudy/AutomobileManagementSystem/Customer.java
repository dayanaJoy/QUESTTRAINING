package com.quest.CaeStudy.AutomobileManagementSystem;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class Customer implements Serializable {
    private String customerID;
    private String name;
    private String mail;
    private List<Vehicle> purchasedVehicles;
    private List<LocalDateTime> purchaseDateTime;

    public Customer(String customerID, String name, String mail) {
        this.customerID = customerID;
        this.name = name;
        this.mail = mail;
        this.purchasedVehicles = new ArrayList<>();
        this.purchaseDateTime = new ArrayList<>();
    }
    public void addPurchasedVehicle(Vehicle vehicle) {
        this.purchasedVehicles.add(vehicle);
        this.purchaseDateTime.add(LocalDateTime.now());
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Vehicle> getPurchasedVehicles() {
        return purchasedVehicles;
    }

    public void setPurchasedVehicles(List<Vehicle> purchasedVehicles) {
        this.purchasedVehicles = purchasedVehicles;
    }

    public List<LocalDateTime> getPurchaseDateTime() {
        return purchaseDateTime;
    }

    public void setPurchaseDateTime(List<LocalDateTime> purchaseDateTime) {
        this.purchaseDateTime = purchaseDateTime;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerID='" + customerID + '\'' +
                ", name='" + name + '\'' +
                ", mail='" + mail + '\'' +
                ", purchasedVehicles=" + purchasedVehicles +
                '}';
    }
}
