package com.roomies.backend.repository;

import com.roomies.backend.data.Group;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface GroupRepository extends MongoRepository<Group, String> {
}
