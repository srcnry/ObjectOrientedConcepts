package com.missingartifacts.polymorphism;

public class Truck implements Vehicle {

    private String truckType;

    public Truck(String truckType) {
        this.truckType = truckType;
    }

    public String getTruckType() {
        return truckType;
    }

    public void setTruckType(String truckType) {
        this.truckType = truckType;
    }

    @Override
    public void doMaintenance() {
        System.out.println("I am a Truck and having maintenance");
    }

    @Override
    public String toString() {
        return "Truck{" +
                "truckType='" + truckType + '\'' +
                '}';
    }
}
