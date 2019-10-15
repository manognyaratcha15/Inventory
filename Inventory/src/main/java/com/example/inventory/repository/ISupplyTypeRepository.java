package com.example.inventory.repository;

import com.example.inventory.domain.Inventory;
import com.example.inventory.domain.SupplyType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISupplyTypeRepository extends JpaRepository<SupplyType,Long> {
}
