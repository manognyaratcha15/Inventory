package com.example.inventory.service;

import com.example.inventory.domain.SupplyType;
import com.example.inventory.repository.ISupplyTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class SupplyTypeService implements ISupplyTypeService{
    @Autowired
    ISupplyTypeRepository iSupplyTypeRepository;

    @Override
    public SupplyType save(SupplyType supplyType)
    {
        return iSupplyTypeRepository.save(supplyType);
    }

    @Override
    public Optional<SupplyType> getById(Long id)
    {
        return iSupplyTypeRepository.findById(id);
    }
    @Override
    public Optional<SupplyType> putById(Long id)
    {
        return iSupplyTypeRepository.findById(id);
    }
}
