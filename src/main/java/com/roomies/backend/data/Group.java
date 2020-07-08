package com.roomies.backend.data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.ArrayList;
import java.util.List;

/** Represents a group of users that are roommates */
public class Group {

  @Id
  private String id;

  private String name;
  @DBRef
  private List<User> users;

  public Group() {}

  public Group(String name, List<User> users) {
    this.name = name;
    this.users = users;
  }

  public Group(String name, Group group1, Group group2) {
    this.name = name;
    this.users = new ArrayList<>(group1.users);
    this.users.addAll(group2.users);
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

  public int size() {
    return users.size();
  }
}
