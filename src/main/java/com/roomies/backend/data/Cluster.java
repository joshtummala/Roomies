package com.roomies.backend.data;

import org.springframework.data.annotation.Id;

import java.util.Set;

public class Cluster {

    @Id
    private String Id;

    private Set<Listing> listings;
    private ProfessionalUser head;
    private String name;
}
