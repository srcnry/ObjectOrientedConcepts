package com.missingartifacts.inheritance.entity;

public class House {
    private String address;
    private String owner;

    public House(String address, String owner){
        this.address = address;
        this.owner = owner;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "House{" +
                "address='" + address + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}
