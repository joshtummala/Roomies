package com.roomies.backend.controller;

import com.roomies.backend.data.ProfessionalUser;
import com.roomies.backend.service.ProfessionalUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pro-user")
public class ProfessionalUserController {
  @Autowired
  private ProfessionalUserService userService;

  @GetMapping
  public List<ProfessionalUser> findAll() {
    return userService.findAll();
  }

  @GetMapping("/{id}")
  public ProfessionalUser findById(@PathVariable String id) {
    return userService.findById(id);
  }

  @PostMapping
  public ProfessionalUser create(@RequestBody ProfessionalUser user){
    return userService.save(user);
  }

  @PutMapping("/{id}")
  public ProfessionalUser update(@RequestBody ProfessionalUser user, @PathVariable String id){
    return userService.save(user);
  }

  @DeleteMapping("/{id}")
  public void deleteById(@PathVariable String id) {
    userService.deleteById(id);
  }
}
