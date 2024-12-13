package com.quest.Practice.BMWServices;

import java.util.HashSet;
import java.util.Set;

public class ServiceCenter<T> {
    private Set<T> servicedVehicles;

    public ServiceCenter() {
        this.servicedVehicles = new HashSet<>();
    }

    public void addServicedVehicle(T vehicle) {
        servicedVehicles.add(vehicle);
    }

    public Set<T> getAllServicedVehicles() {
        return servicedVehicles;
    }
}

