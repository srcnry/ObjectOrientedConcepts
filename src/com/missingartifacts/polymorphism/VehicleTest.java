package com.missingartifacts.polymorphism;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class VehicleTest {
    public static void main(String args[]){
        List<Vehicle> allVehicles = getAllVehicles();

        for (Vehicle each: allVehicles) {
            each.doMaintenance();
        }

    }

    public static List<Vehicle> getAllVehicles(){
        List<Vehicle> allVehicles = new ArrayList<>();
        Random rand = new Random();
        int counter = 0;
        while( counter <= 10) {
            int  n = rand.nextInt(3) + 1;

            switch (n) {
                case 1: allVehicles.add(new Car("Mercedes GLA")); break;
                case 2: allVehicles.add(new Ship("Tanker")); break;
                case 3: allVehicles.add(new Truck("Dumper")); break;
                default : break;
            }

            counter++;
        }
        return allVehicles;

    }
}
