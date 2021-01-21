package com.tonsaito.checkout.repository;

import com.tonsaito.checkout.entity.ProductEntity;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<ProductEntity, Integer> {
}
