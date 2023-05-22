package com.example.CustomerServiceOne.Service;

import com.example.CustomerServiceOne.Model.Customer;

import java.util.List;

public interface CustomerService {

    public Customer createCustomer(Customer customer);

    List<Customer> getAllCustomer();

    Customer updateCustomer(Customer customer,String id);

    String deleteCustomer(String id);
}
