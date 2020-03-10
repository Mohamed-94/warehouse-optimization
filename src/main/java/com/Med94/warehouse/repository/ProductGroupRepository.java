package com.med94.warehouse.repository;

import com.med94.warehouse.model.ProductGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


public interface ProductGroupRepository extends JpaRepository<ProductGroup, Long> {


}