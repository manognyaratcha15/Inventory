package com.example.inventory.service;

import com.example.inventory.domain.Location;

import java.util.Optional;

public interface ILocationService {

    Location save(Location location);

    Optional<Location> getById(Long id);

    Location put(Location location, Long id);

}
