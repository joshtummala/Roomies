package com.roomies.backend.repository;

import com.roomies.backend.data.Listing;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ListingRepository extends MongoRepository<Listing, String> {
}