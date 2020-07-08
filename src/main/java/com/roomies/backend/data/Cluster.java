package com.roomies.backend.data;

import org.springframework.data.annotation.Id;

import java.util.Objects;
import java.util.Set;

public class Cluster {

    @Id
    private String Id;

    private String name;
    private String description;
    private Set<String> listings;

    public Cluster(String name, String description, Set<String> listings) {
        this.name = name;
        this.description = description;
        this.listings = listings;
    }

    public Set<String> getListings() {
        return listings;
    }

    public void setListings(Set<String> listings) {
        this.listings = listings;
    }

    public String getId() {
        return Id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cluster cluster = (Cluster) o;
        return Id.equals(cluster.Id);
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
