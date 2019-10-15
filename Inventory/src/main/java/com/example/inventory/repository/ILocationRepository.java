package com.example.inventory.repository;

import com.example.inventory.domain.Inventory;
import com.example.inventory.domain.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILocationRepository extends JpaRepository<Location,Long> {
}
