package com.missingartifacts.inheritance;

import com.missingartifacts.inheritance.entity.House;
import com.missingartifacts.inheritance.entity.Person;

public class InsuranceTest {
    public static void main(String args[]){

        HouseInsurancePolicy houseInsurancePolicy = new HouseInsurancePolicy(1,
                new House("Kadikoy/Istanbul","Ali Veli"),1,1234);

        System.out.println(houseInsurancePolicy.toString());

        LifeInsurancePolicy lifeInsurancePolicy = new LifeInsurancePolicy( new Person("Ali","Dem"),2,5432);

        System.out.println(lifeInsurancePolicy.toString());
    }
}
