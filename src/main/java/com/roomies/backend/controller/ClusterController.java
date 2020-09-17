package com.roomies.backend.controller;

import com.roomies.backend.data.Cluster;
import com.roomies.backend.service.ClusterService;

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
@RequestMapping("/api/cluster")
public class ClusterController {

    @Autowired
    private ClusterService clusterService;

    @GetMapping
    public List<Cluster> findAll() {
        return clusterService.findAll();
    }

    @GetMapping("/{id}")
    public Cluster findById(@PathVariable String id) {
        return clusterService.findById(id);
    }

    @PostMapping
    public Cluster create(@RequestBody Cluster cluster){ return clusterService.save(cluster); }

    @PutMapping("/{id}")
    public Cluster update(@RequestBody Cluster cluster, @PathVariable String id){
        cluster.setId(id);
        return clusterService.save(cluster);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable String id) {
        clusterService.deleteById(id);
    }
}
