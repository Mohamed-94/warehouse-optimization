package com.med94.warehouse.repository;

import com.med94.warehouse.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ItemRepository extends JpaRepository<Item, Long> {


}