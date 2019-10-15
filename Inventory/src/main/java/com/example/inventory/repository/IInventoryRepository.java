package com.example.inventory.repository;

import com.example.inventory.domain.Inventory;
import com.example.inventory.domain.Location;
import com.example.inventory.domain.SupplyData;
import com.example.inventory.domain.SupplyType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface IInventoryRepository extends JpaRepository<Inventory, Long>
{
      //    Inventory findInventoryByItemId(String itemId);
//    Inventory findInventoryByLocationId(Long LoctionId);
      Inventory findInventoryByItemIdAndLocationAndSupplyType(String itemId, Location location, SupplyType typeId);
      //List<Inventory> findInventoryByItemIdAndQuantityGreaterThanOrderByQuantityDesc(String itemId,int Quantity);

      @Query(value = "select  * from inventory where item_id=?1 and quantity>=?2 order by quantity desc limit 1", nativeQuery = true)

      Inventory  getLocationBasedOnQuantity(String itemId,Integer quantity);

}
