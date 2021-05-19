package com.tr.shopwhyapp.product.repository;

import com.tr.shopwhyapp.product.domain.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
