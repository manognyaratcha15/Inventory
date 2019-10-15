package com.example.inventory.controller;

import com.example.inventory.domain.SupplyData;
import com.example.inventory.service.ISupplyDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/a1/supplydata")
public class SupplyDataController
{
    @Autowired
    ISupplyDataService iSupplyDataService;
    @PostMapping("/post")
    SupplyData save(@RequestBody SupplyData supplyData)
    {
        return iSupplyDataService.save1(supplyData);
    }
    @GetMapping("/get1/{id}")
    Optional<SupplyData> getById(@PathVariable("id") Long id)
    {
        return iSupplyDataService.getById1(id);
    }
    @PutMapping
    public Optional<SupplyData> Put(@RequestBody SupplyData supplyData, @PathVariable Long id)
    {
        return iSupplyDataService.put(supplyData,id);
    }
}
