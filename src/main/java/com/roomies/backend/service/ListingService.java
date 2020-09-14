package com.roomies.backend.service;

import com.roomies.backend.data.Cluster;
import com.roomies.backend.data.Group;
import com.roomies.backend.data.Listing;
import com.roomies.backend.repository.ListingRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class ListingService {

    @Autowired
    private ListingRepository listingRepository;
    @Autowired
    private ClusterService clusterService;
    @Autowired
    private GroupService groupService;

    public List<Listing> findAll() {
        Set<String> userRoles = SecurityContextHolder.getContext()
                .getAuthentication()
                .getAuthorities()
                .stream()
                .map(GrantedAuthority::getAuthority)
                .collect(Collectors.toSet());
        return listingRepository.findAll()
                .stream()
                .filter(l -> l.isListed() && l.getAccessRoles().stream()
                        .anyMatch(x -> !userRoles.contains(x.getName().name())))
                .collect(Collectors.toList());
    }

    public Listing findById(String id) {
        Set<String> userRoles = SecurityContextHolder.getContext()
                .getAuthentication()
                .getAuthorities()
                .stream()
                .map(GrantedAuthority::getAuthority)
                .collect(Collectors.toSet());
        Listing listing = listingRepository.findById(id).orElseThrow(RuntimeException::new);
        if ((!listing.isListed() && listing.getOwner().getUsername().equals(
                SecurityContextHolder.getContext().getAuthentication().getName())) ||
                (listing.isListed() && listing.getAccessRoles()
                .stream().anyMatch(x -> userRoles.contains(x.getName().name())))) {
            return listing;
        } else throw new RuntimeException("User does not have access to this listing");
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
        if (!clusterService.contains(listing.getCluster().getId())) {
            throw new IllegalArgumentException("The cluster associated with this listing does not exist");
        }
        return this.save(listing);
    }

    public boolean addGroup(String groupId, String listingId) {
        Group group = this.groupService.findById(groupId);
        Listing listing = this.findById(listingId);
        if (group.size() > listing.getDescription().getCapacity()) {
            throw new IllegalArgumentException("The Group size is too large!");
        } else if (listing.getGroupQueue().containsKey(
                listing.getDescription().getCapacity() - group.size())) {
            return true;
        }
        return false;
    }

    public List<Listing> searchBy(int num, int index) {
        return this.findAll();
    }

}
