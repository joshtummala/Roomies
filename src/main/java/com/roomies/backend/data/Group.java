package com.roomies.backend.data;

import org.springframework.data.annotation.Id;

import java.util.List;

/** Represents a group of users that are roommates */
public class Group {

  @Id
  private String id;

  private String name;
  private List<User> users;

  public Group() {}

  public Group(String name, List<User> users) {
    this.name = name;
    this.users = users;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<User> getUsers() {
    return users;
  }

  public void setUsers(List<User> users) {
    this.users = users;
  }
}
