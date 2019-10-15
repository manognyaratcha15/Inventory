package com.example.inventory.service;

import com.example.inventory.domain.Inventory;
import com.example.inventory.domain.SupplyData;
import com.example.inventory.repository.ISupplyDataRepository;
import com.example.inventory.repository.IInventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.web.bind.annotation.ControllerAdvice;

import java.util.Optional;

@ControllerAdvice
@Service
public class SupplyDataService implements ISupplyDataService
{
    @Autowired
    ISupplyDataRepository iSupplyDataRepository;
    @Autowired
    IInventoryRepository iinventoryRepository;
    @Autowired
    IInventoryService iInventoryService;

    @Override
    public SupplyData save1(SupplyData supplyData)
    {
        Integer quant;
        Inventory inventory =  iinventoryRepository.findInventoryByItemIdAndLocationAndSupplyType(supplyData.getItemId(),supplyData.getLocation(),supplyData.getSupplyType());
        if(inventory != null)
        {
            if(supplyData.getQuantityAdjustmentType().equals("+"))
            {
                quant =  (supplyData.getQuantity() + inventory.getQuantity());
                inventory.setQuantity(quant);

            }
            else if(supplyData.getQuantityAdjustmentType().equals("-"))
            {
                quant = inventory.getQuantity() - supplyData.getQuantity();
                inventory.setQuantity(quant);
            }
        }
        else
        {
            inventory = new Inventory();
            inventory.setItemId(supplyData.getItemId());
            inventory.setLocation(supplyData.getLocation());
            inventory.setQuantity(supplyData.getQuantity());
            inventory.setSupplyType(supplyData.getSupplyType());
        }
        supplyData = iSupplyDataRepository.save(supplyData);
        iinventoryRepository.save(inventory);

        return supplyData;
    }
    @Override
    public Optional<SupplyData>getById1(Long Id)
    {
        return  iSupplyDataRepository.findById(Id);
    }
    @Override
    public Optional<SupplyData> put(SupplyData supplyData, Long id) {
        if(iSupplyDataRepository.findById(id).isPresent())
        {
            iSupplyDataRepository.save(supplyData);
        }
        return null;
    }
}