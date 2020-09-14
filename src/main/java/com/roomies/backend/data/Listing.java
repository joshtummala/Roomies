package com.roomies.backend.data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Listing {

    @Id
    private String id;

    private String name;
    private Group group;

    @DBRef
    private User owner;
    private boolean isListed;

    @DBRef
    private Set<Role> accessRoles = new HashSet<>();

    @DBRef
    private Cluster cluster;
    private Description description;

    private Map<Integer, List<String>> groupQueue;

    public boolean isListed() {
        return isListed;
    }

    public void setListed(boolean listed) {
        isListed = listed;
    }

    public Map<Integer, List<String>> getGroupQueue() {
        return groupQueue;
    }

    public void setGroupQueue(Map<Integer, List<String>> groupQueue) {
        this.groupQueue = groupQueue;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

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

    public boolean getIsListed() {
        return isListed;
    }

    public void setIsListed(boolean listed) {
        isListed = listed;
    }

    public Cluster getCluster() {
        return cluster;
    }

    public void setCluster(Cluster cluster) {
        this.cluster = cluster;
    }

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }

    public Set<Role> getAccessRoles() {
        return accessRoles;
    }

    public void setAccessRoles(Set<Role> accessRoles) {
        this.accessRoles = accessRoles;
    }

    public Listing() {}

    public Listing(String name, Group group, User owner, boolean isListed, Set<Role> accessRoles,
                   Cluster cluster, Description description,
                   Map<Integer, List<String>> groupQueue) {
        this.name = name;
        this.group = group;
        this.owner = owner;
        this.isListed = isListed;
        this.accessRoles = accessRoles;
        this.cluster = cluster;
        this.description = description;
        this.groupQueue = groupQueue;
    }

}
