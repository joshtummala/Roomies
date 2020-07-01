package com.roomies.backend.data;

import org.springframework.data.annotation.Id;

import java.util.Objects;

public class Cluster {

    @Id
    private String Id;

    private String name;
    private String description;

    public Cluster(String id, String name, String description) {
        Id = id;
        this.name = name;
        this.description = description;
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
