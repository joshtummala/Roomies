package com.roomies.backend.controller;

import com.roomies.backend.data.Group;
import com.roomies.backend.data.User;
import com.roomies.backend.service.GroupService;
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
@RequestMapping("/group")
public class GroupController {

  @Autowired
  private GroupService groupService;

  @GetMapping
  public List<Group> findAll() {
    return groupService.findAll();
  }

  @GetMapping("/{id}")
  public Group findById(@PathVariable String id) {
    return groupService.findById(id);
  }

  @PostMapping
  public Group create(@RequestBody Group group){
    return groupService.save(group);
  }

  @PutMapping("/{id}")
  public Group update(@RequestBody Group group, @PathVariable String id){
    return groupService.save(group);
  }

  @DeleteMapping("/{id}")
  public void deleteById(@PathVariable String id) {
    groupService.deleteById(id);
  }


}
