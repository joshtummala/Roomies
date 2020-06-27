package com.roomies.backend.data;

import org.springframework.data.annotation.Id;

public class Listing {

    @Id
    private String id;

    private String name;
    private Group group;
    private ProfessionalUser landlord;
    private ProfessionalUser agent;
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

    public ProfessionalUser getLandlord() {
        return landlord;
    }

    public void setLandlord(ProfessionalUser landlord) {
        this.landlord = landlord;
    }

    public ProfessionalUser getAgent() {
        return agent;
    }

    public void setAgent(ProfessionalUser agent) {
        this.agent = agent;
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

    public Listing(String name, Group group, ProfessionalUser landlord,
                   ProfessionalUser agent, Cluster building, Description description) {
        this.name = name;
        this.group = group;
        this.landlord = landlord;
        this.agent = agent;
        this.building = building;
        this.description = description;
    }
}
