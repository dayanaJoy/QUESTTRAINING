package com.quest.oops.Interfaces;

public class VehicleResult implements Vehicle1,Vehicle2 {
    @Override
    public void wheel() {
        System.out.println("wheel");
    }

    @Override
    public void start() {
        System.out.println("start vehicle1");
    }

    @Override
    public void stop() {
        System.out.println("stop vehicle1");
    }

    @Override
    public void start2() {
        System.out.println("start vehicle2");
    }

    public static void main(String[] args) {
        VehicleResult vehicle = new VehicleResult();
        vehicle.wheel();
        vehicle.start();
        vehicle.stop();
        vehicle.start2();
    }
}
