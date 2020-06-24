package com.roomies.backend.service;

import com.roomies.backend.data.ProfessionalUser;
import com.roomies.backend.data.User;
import com.roomies.backend.repository.ProfessionalUserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessionalUserService {

  @Autowired
  private ProfessionalUserRepository userRepository;

  public List<ProfessionalUser> findAll() {
    return userRepository.findAll();
  }

  public ProfessionalUser findById(String id) {
    return userRepository.findById(id).orElseThrow(RuntimeException::new);
  }

  public ProfessionalUser save(ProfessionalUser user) {
    return userRepository.save(user);
  }

  public void deleteById(String id) {
    userRepository.deleteById(id);
  }

}
