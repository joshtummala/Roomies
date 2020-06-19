package com.roomies.backend.data;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class User {

  @Id
  private String id;

  private String username;
  private String password;
  private Date dob;
  private Location location;

  public User(String id, String username, String password, Date dob, Location location) {
    this.id = id;
    this.username = username;
    this.password = password;
    this.dob = dob;
  }

  @Override
  public String toString() {
    return "User{" +
            "id='" + id + '\'' +
            ", username='" + username + '\'' +
            ", password='" + password + '\'' +
            ", dob=" + dob +
            ", location=" + location +
            '}';
  }

  public String getId() {
    return id;
  }

  public String getUsername() {
    return username;
  }

  public String getPassword() {
    return password;
  }

  public Date getDob() {
    return dob;
  }

  public Location getLocation() {
    return location;
  }
}
