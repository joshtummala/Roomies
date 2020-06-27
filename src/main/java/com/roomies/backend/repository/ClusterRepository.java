package com.roomies.backend.repository;

import com.roomies.backend.data.Cluster;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClusterRepository extends MongoRepository<Cluster, String> {
}