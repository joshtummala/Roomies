package com.roomies.backend.data;

import com.fasterxml.jackson.annotation.JsonFormat;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class User {

  @Id
  private String id;

  private String username;
  private String password;
  private String email;
  @JsonFormat(pattern = "yyyy-MM-dd")
  private Date dob;
  private String phone;

  @DBRef
  private Set<Role> roles = new HashSet<>();

  public User() {}

  public User(String username, String password, String email,
              Date dob, String phone) {
    this.username = username;
    this.password = password;
    this.email = email;
    this.dob = dob;
    this.phone = phone;
  }

  public Set<Role> getRoles() {
    return roles;
  }

  public void setRoles(Set<Role> roles) {
    this.roles = roles;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
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

  public void setEmail(String email) {
    this.email = email;
  }
}
