package com.quest.CaeStudy.BMWServices;

public class CombustionEngineVehicle extends Vehicle{
    private String fuelType;
    private double engineCapacity;

    public CombustionEngineVehicle(String vin, String brand, String model, int year, double mileage, String ownerName, String fuelType, double engineCapacity) {
        super(vin, brand, model, year, mileage, ownerName);
        this.fuelType = fuelType;
        this.engineCapacity = engineCapacity;

    }
    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + "CombustionEngineVehicle{" +
                "fuelType = '" + fuelType + '\'' +
                ", engineCapacity = " + engineCapacity +
                '}';
    }
}
