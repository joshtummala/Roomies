package com.roomies.backend.repository;

import com.roomies.backend.data.Photo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface PhotoRepository extends MongoRepository<Photo, String> {
}
