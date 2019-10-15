package com.example.inventory.service;

import com.example.inventory.domain.Inventory;

import java.util.Optional;

public interface IInventoryService
{
    Inventory save(Inventory inventory);

    Optional<Inventory> getById(Long Id);

    void delete(Long id);

    Inventory put(Inventory inventory, Long id);

    //Optional<Inventory> FindItemIdBId(Long id);
    Long getLocation(String itemId, Integer quantity);

}