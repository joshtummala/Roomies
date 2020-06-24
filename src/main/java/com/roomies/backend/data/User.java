package com.roomies.backend.data;

import com.fasterxml.jackson.annotation.JsonFormat;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class User {

  @Id
  private String id;

  private String username;
  private String password;
  private String email;
  @JsonFormat(pattern="yyyy-MM-dd")
  private Date dob;
  private Location location;

  public User() {}

  public User(String username, String password, String email, Date dob, Location location) {
    this.username = username;
    this.password = password;
    this.email = email;
    this.dob = dob;
    this.location = location;
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

  public String getEmail() {
    return email;
  }

  public void setId(String id) {
    this.id = id;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public void setDob(Date dob) {
    this.dob = dob;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  public void setEmail(String email) {
    this.email = email;
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
}
