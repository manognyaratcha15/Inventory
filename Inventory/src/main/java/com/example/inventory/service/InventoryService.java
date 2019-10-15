package com.example.inventory.service;

import com.example.inventory.repository.IInventoryRepository;
import com.example.inventory.domain.Inventory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class InventoryService implements IInventoryService
{
    @Autowired
    IInventoryRepository iinventoryRepository;

    @Override
    public Inventory save(Inventory inventory)
    {

        return iinventoryRepository.save(inventory);

    }

    @Override
    public Optional<Inventory> getById(Long id)
    {
        return iinventoryRepository.findById(id);
    }
    @Override
    public void delete(Long id)
    {
        iinventoryRepository.deleteById(id);
    }
    @Override
    public Inventory put(Inventory inventory, Long id)
    {
        if(iinventoryRepository.findById(id).isPresent())
        {
            iinventoryRepository.save(inventory);
        }
        return null;
    }

    @Override
    public Long getLocation(String itemId, Integer quantity)
    {
        List<Long> locationid=new ArrayList<>();
        //List<Inventory> inventories=iinventoryRepository.findInventoryByItemIdAndQuantityGreaterThanOrderByQuantityDesc(itemId,quantity);
        Inventory inventories=iinventoryRepository.getLocationBasedOnQuantity(itemId,quantity);
        //int a[]=new int[3];
       /* int maxQty=-1;
        Long maxLocationId=new Long(0);
        for(int i=0;i<inventories.size();i++)
        {
           // int max=a[0];
            Inventory inventory=inventories.get(i);

                    if(inventory.getQuantity()>quantity)
                    {
                        if((maxQty<=inventory.getQuantity())){
                            maxQty=inventory.getQuantity();
                            maxLocationId=inventory.getLocation().getLocationId();
                        }
                        locationid.add(inventory.getLocation().getLocationId());
                    }
       }
        Collections.max(locationid);
        for(int k=0;k<locationid.size();k++)
        {
            System.out.println(locationid.get(k));
        }*/
        if(inventories!=null){
            return inventories.getLocation().getLocationId();
        }
        else
            return null;
    }
}