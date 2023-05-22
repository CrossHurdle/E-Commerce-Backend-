package com.example.CustomerServiceTwo.Repository;

import com.example.CustomerServiceTwo.Model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product,String> {
}
