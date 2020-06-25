package com.roomies.backend.service;

import com.roomies.backend.data.Group;
import com.roomies.backend.repository.GroupRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupService {

  @Autowired
  private GroupRepository groupRepository;

  public List<Group> findAll() {
    return groupRepository.findAll();
  }

  public Group findById(String id) {
    return groupRepository.findById(id).orElseThrow(RuntimeException::new);
  }

  public Group save(Group group) {
    return groupRepository.save(group);
  }

  public void deleteById(String id) {
    groupRepository.deleteById(id);
  }

}
