package com.roomies.backend.controller;

import com.roomies.backend.data.User;
import com.roomies.backend.service.UserService;

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
@RequestMapping("/user")
public class UserController {

  @Autowired
  private UserService userService;

  @GetMapping
  public List<User> findAll() {
    return userService.findAll();
  }

  @GetMapping("/{id}")
  public User findById(@PathVariable String id) {
    return userService.findById(id);
  }

  @PostMapping
  public User create(@RequestBody User user){
    return userService.save(user);
  }

  @PutMapping("/{id}")
  public User update(@RequestBody User user, @PathVariable String id){
    return userService.save(user);
  }

  @DeleteMapping("/{id}")
  public void deleteById(@PathVariable String id) {
    userService.deleteById(id);
  }
}
