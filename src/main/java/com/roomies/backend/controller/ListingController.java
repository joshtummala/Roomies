package com.roomies.backend.controller;

import com.roomies.backend.data.Listing;
import com.roomies.backend.service.ListingService;

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
@RequestMapping("/listing")
public class ListingController {

    @Autowired
    private ListingService listingService;

    @GetMapping
    public List<Listing> findAll() {
        return listingService.findAll();
    }

    @GetMapping("/{id}")
    public Listing findById(@PathVariable String id) {
        return listingService.findById(id);
    }

    @PostMapping
    public Listing create(@RequestBody Listing listing){ return listingService.createListing(listing); }

    @PutMapping("/{id}")
    public Listing update(@RequestBody Listing listing, @PathVariable String id){


        return listingService.save(listing);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable String id) {
        listingService.deleteById(id);
    }
}
