package com.roomies.backend.repository;

import com.roomies.backend.data.ERole;
import com.roomies.backend.data.Role;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface RoleRepository extends MongoRepository<Role, String> {
  Optional<Role> findByName(ERole roleUser);
}
