package com.roomies.backend.data;

import org.springframework.data.annotation.Id;

import java.util.Set;

public class Listing {

    @Id
    private String id;

    private String name;
    private Group group;
    private boolean isListed;
    private Set<String> accessIDs;
    private ProfessionalUser landlord;
    private ProfessionalUser agent;
    private String clusterID;
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

    public boolean isListed() {
        return isListed;
    }

    public void setListed(boolean listed) {
        isListed = listed;
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

    public String getClusterID() {
        return clusterID;
    }

    public void setClusterID(String clusterID) {
        this.clusterID = clusterID;
    }

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }

    public Set<String> getAccessIDs() {
        return accessIDs;
    }

    public void setAccessIDs(Set<String> accessIDs) {
        this.accessIDs = accessIDs;
    }

    public Listing(String name, Group group, boolean isListed, Set<String> accessIDs, ProfessionalUser landlord,
                   ProfessionalUser agent, String clusterID, Description description) {
        this.name = name;
        this.group = group;
        this.isListed = isListed;
        this.accessIDs = accessIDs;
        this.landlord = landlord;
        this.agent = agent;
        this.clusterID = clusterID;
        this.description = description;
    }
}
