package com.roomies.backend.controller;

import com.roomies.backend.data.User;
import com.roomies.backend.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.parameters.P;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/user")
public class UserController {

  @Autowired
  private UserService userService;

  @GetMapping
  public List<User> findAll() {
    return userService.findAll();
  }

  @GetMapping("/id")
  @PreAuthorize("hasRole('ADMIN')")
  public User findById(@RequestBody String id) {
    return userService.findById(id);
  }

  @GetMapping("/username")
  @PreAuthorize("permitAll()")
  public User findByUsername(@RequestBody String username) {
    return userService.findByUsername(username);
  }

  @GetMapping("/username/exists")
  @PreAuthorize("permitAll()")
  public Boolean existsByUsername(@RequestBody String username) {
    return userService.existsByUsername(username);
  }

  @GetMapping("/email/exists")
  @PreAuthorize("permitAll()")
  public Boolean existsByEmail(@RequestBody String email) {
    return userService.existsByEmail(email);
  }

  @PutMapping("/{id}")
  @PreAuthorize("#user.username == authentication.name")
  public User update(@RequestBody @P("user") User user, @PathVariable String id){
    return userService.save(user);
  }

  @DeleteMapping("/{id}")
  @PreAuthorize("(#user.username == authentication.name) or (hasRole('ADMIN'))")
  public void deleteById(@PathVariable String id) {
    userService.deleteById(id);
  }

}
