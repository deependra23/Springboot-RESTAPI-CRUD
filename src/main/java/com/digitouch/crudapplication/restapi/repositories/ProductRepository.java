package com.digitouch.crudapplication.restapi.repositories;

import com.digitouch.crudapplication.restapi.models.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
}
