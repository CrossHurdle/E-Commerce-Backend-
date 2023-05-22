package com.example.CustomerServiceOne.Repository;

import com.example.CustomerServiceOne.Model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer,String> {
}
