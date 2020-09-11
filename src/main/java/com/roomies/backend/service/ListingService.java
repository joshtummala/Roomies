package com.roomies.backend.service;

import com.roomies.backend.data.Cluster;
import com.roomies.backend.data.Listing;
import com.roomies.backend.repository.ListingRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListingService {

    @Autowired
    private ListingRepository listingRepository;
    @Autowired
    private ClusterService clusterService;


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

    public boolean contains(String id)  {
        try {
            this.findById(id);
        } catch(Exception e) {
            return false;
        }
        return true;
    }

    // Creates a new Listing and saves it
    // throws IllegalArgumentException if the cluster the listing
    // is tied to does not exist
    public Listing createListing(Listing listing)   {
        //user authentication caller's problem

        if (!clusterService.contains(listing.getClusterID())) {
            throw new IllegalArgumentException("The cluster associated with this listing does not exist");
        }
        return this.save(listing);
    }

    public Listing update(Listing listing) {
        if (!this.contains(listing.getId())) {
            throw new IllegalArgumentException("This listing does not exist");
        }
        return this.save(listing);
    }

    public Listing updateCluster(Listing listing, Cluster cluster) {
        if (!this.contains(listing.getId())) {
            throw new IllegalArgumentException("This listing does not exist");
        }

        if (!clusterService.contains(cluster.getId())) {
            throw new IllegalArgumentException("The cluster associated with this listing does not exist");
        }

        listing.setClusterID(cluster.getId());
        return this.save(listing);
    }
}
