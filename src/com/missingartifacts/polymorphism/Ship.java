package com.missingartifacts.polymorphism;

public class Ship implements Vehicle {

    private String shipModel;

    public Ship(String shipModel) {
        this.shipModel = shipModel;
    }

    @Override
    public void doMaintenance() {
        System.out.println("I am a ship and having maintenance");
    }
}
