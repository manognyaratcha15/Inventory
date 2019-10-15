package com.example.inventory.controller;

import com.example.inventory.domain.Inventory;
import com.example.inventory.repository.IInventoryRepository;
import com.example.inventory.service.IInventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/a1/inventory")
public class InventoryController {
    @Autowired
    IInventoryService iInventoryService;

    @Autowired
    IInventoryRepository iinventoryRepository;

    @PostMapping("/post")
    Inventory save(@RequestBody Inventory inventory) {

        //System.out.println(inventory.getQuantity());
        return iInventoryService.save(inventory);
    }

    @GetMapping("/get/{id}")
    Optional<Inventory> getById(@PathVariable("id") Long id) {
        return iInventoryService.getById(id);
    }
//    @GetMapping("/get/itemid/{id}")
//    Inventory getById(@PathVariable("id") String id) {
//        return iinventoryRepository.findInventoryByItemId(id);
//    }


    @DeleteMapping("/delete/{id}")
    void Delete(@PathVariable Long id) {
        iInventoryService.delete(id);
    }

    @PutMapping("/put/{id}")
    public Inventory Put(@RequestBody Inventory inventory, @PathVariable Long id) {
        return iInventoryService.put(inventory, id);
    }

    @GetMapping("/location/get/{itemID}")
    public Long getLocation(@PathVariable("itemID") String itemId, @RequestParam Integer quantity)
    {
        return iInventoryService.getLocation(itemId,quantity);
    }
}
