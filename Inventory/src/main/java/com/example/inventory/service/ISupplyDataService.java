package com.example.inventory.service;

import com.example.inventory.domain.SupplyData;

import java.util.Optional;

public interface ISupplyDataService
{
    SupplyData save1(SupplyData supplyData);

    Optional<SupplyData> getById1(Long Id);

    Optional<SupplyData> put(SupplyData supplyData, Long id);
}
