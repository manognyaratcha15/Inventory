package com.example.inventory.repository;

import com.example.inventory.domain.SupplyData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISupplyDataRepository extends JpaRepository<SupplyData,Long> {
}
