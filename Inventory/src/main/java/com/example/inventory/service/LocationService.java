package com.example.inventory.service;

import com.example.inventory.domain.Location;
import com.example.inventory.repository.ILocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class LocationService implements ILocationService{

    @Autowired
    ILocationRepository iLocationRepository;

    @Override
    public Location save(Location location) {
        return iLocationRepository.save(location);
    }

    @Override
    public Optional<Location> getById(Long id) {
        return iLocationRepository.findById(id);
    }
    @Override
    public Location put(Location location, Long id)
    {
        return iLocationRepository.save(location);
    }

}
