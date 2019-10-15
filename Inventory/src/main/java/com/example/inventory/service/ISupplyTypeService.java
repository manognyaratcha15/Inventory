package com.example.inventory.service;

import com.example.inventory.domain.Inventory;
import com.example.inventory.domain.SupplyData;
import com.example.inventory.domain.SupplyType;

import java.util.Optional;

public interface ISupplyTypeService
{
    SupplyType save(SupplyType supplyType);

    Optional<SupplyType> getById(Long Id);

    Optional<SupplyType> putById(Long id);
}
