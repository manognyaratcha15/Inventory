package com.example.inventory.controller;

import com.example.inventory.domain.Location;
import com.example.inventory.service.ILocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
@RestController
@RequestMapping("/api/a1/location")
public class LocationController {

        @Autowired
        ILocationService locationService;
        @PostMapping("/post")
        Location save(@RequestBody Location location)
        {
            return locationService.save(location);
        }
        @GetMapping("/get/{id}")
        Optional<Location> getById(@PathVariable("id") Long id)
        {
            return locationService.getById(id);
        }
        @PutMapping("/put/{id}")
        Location PutById(@PathVariable("id") Long id, @RequestBody Location location)
        {
            return locationService.save(location);
        }
    }