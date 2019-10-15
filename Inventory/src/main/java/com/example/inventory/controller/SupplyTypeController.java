package com.example.inventory.controller;

import com.example.inventory.domain.SupplyType;
import com.example.inventory.service.ISupplyTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
@RestController
@RequestMapping("/api/a1/supplytype")
public class SupplyTypeController
{
    @Autowired
    ISupplyTypeService iSupplyTypeService;
    @PostMapping("/post")
    SupplyType save(@RequestBody SupplyType supplyType)
    {
        return iSupplyTypeService.save(supplyType);
    }
    @GetMapping("/get/{id}")
    Optional<SupplyType> getById(@PathVariable("id") Long id)
    {
        return iSupplyTypeService.getById(id);
    }
    @PutMapping("/put/{id}")
    SupplyType putById(@PathVariable("id") Long id, @RequestBody SupplyType supplyType)
    {
        return iSupplyTypeService.save(supplyType);
    }
}
