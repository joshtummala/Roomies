package com.roomies.backend.repository;

import com.roomies.backend.data.User;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

}
