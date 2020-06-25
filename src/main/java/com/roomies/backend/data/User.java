package com.roomies.backend.data;

import com.fasterxml.jackson.annotation.JsonFormat;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class User extends AbstractUser{

  public User() {
    super();
  }

  public User(String username, String password, String email, Date dob, Location location) {
    super(username, password, email, dob, location);
  }

}
