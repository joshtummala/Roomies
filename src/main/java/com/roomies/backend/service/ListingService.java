package com.roomies.backend.service;

import com.roomies.backend.data.Listing;
import com.roomies.backend.repository.ListingRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListingService {

    @Autowired
    private ListingRepository listingRepository;

    public List<Listing> findAll() {
        return listingRepository.findAll();
    }

    public Listing findById(String id) {
        return listingRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    public Listing save(Listing listing) {
        return listingRepository.save(listing);
    }

    public void deleteById(String id) {
        listingRepository.deleteById(id);
    }

}
