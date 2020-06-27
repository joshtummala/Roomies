package com.roomies.backend.data;

import org.springframework.data.annotation.Id;

public class Description {

    @Id
    private String id;

    private double rent;
    private int capacity;
    private Location location;
    private String description;

    public Description(double rent, int capacity, Location location, String description) {
        this.rent = rent;
        this.capacity = capacity;
        this.location = location;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
