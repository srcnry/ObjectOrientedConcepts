package com.missingartifacts.inheritance;

import com.missingartifacts.inheritance.entity.House;

public class HouseInsurancePolicy extends InsurancePolicy {

    private int type;
    private House house;

    public HouseInsurancePolicy(int type, House house, int clientId, long issueNum) {
        super(clientId, issueNum);
        this.type = type;
        this.house = house;
    }

    @Override
    public String toString() {
        return "HouseInsurancePolicy{" +
                "type=" + type +
                ", house=" + house +
                "} " + super.toString();
    }
}
