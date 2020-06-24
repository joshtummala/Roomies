package com.roomies.backend.repository;

import com.roomies.backend.data.ProfessionalUser;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProfessionalUserRepository extends MongoRepository<ProfessionalUser, String> { }
