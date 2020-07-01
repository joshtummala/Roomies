package com.roomies.backend.data;

import org.springframework.data.annotation.Id;

public class Listing {

    @Id
    private String id;

    private String name;
    private Group group;
    private Cluster building;
    private Description description;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Cluster getBuilding() {
        return building;
    }

    public void setBuilding(Cluster building) {
        this.building = building;
    }

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }

}
