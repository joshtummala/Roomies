package com.roomies.backend.data;

public class Description {

    private double rent;
    private int capacity;
    private String description;

    public Description(double rent, int capacity, String description) {
        this.rent = rent;
        this.capacity = capacity;
        this.description = description;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
