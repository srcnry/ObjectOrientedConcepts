package com.missingartifacts.inheritance;

import com.missingartifacts.inheritance.entity.Person;

public class LifeInsurancePolicy extends InsurancePolicy {

    private Person person;

    public LifeInsurancePolicy( Person person, int clientId, long issueNumber) {
        super(clientId, issueNumber);
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "LifeInsurancePolicy{" +
                "person=" + person +
                "} " + super.toString();
    }
}
