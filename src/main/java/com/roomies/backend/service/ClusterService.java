package com.roomies.backend.service;

import com.roomies.backend.data.Cluster;
import com.roomies.backend.repository.ClusterRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ClusterService {

    @Autowired
    private ClusterRepository clusterRepository;

    public List<Cluster> findAll() {
        return clusterRepository.findAll();
    }

    public Cluster findById(String id) {
        return clusterRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    public Cluster save(Cluster cluster) {
        return clusterRepository.save(cluster);
    }

    public void deleteById(String id) {
        clusterRepository.deleteById(id);
    }

    public boolean contains(String id)  {
        try {
            this.findById(id);
        } catch(Exception e) {
            return false;
        }
        return true;
    }

}
