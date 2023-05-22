package com.example.CustomerServiceOne.Controller;

import com.example.CustomerServiceOne.Model.Customer;
import com.example.CustomerServiceOne.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;
    @PostMapping("/postcustomers")
    public Customer createCustomer(@RequestBody Customer customer){
        return customerService.createCustomer(customer);
    }
    @GetMapping("/getcustomers")
    public List<Customer> getAllCustomer(){
        return customerService.getAllCustomer();
    }

    @PutMapping("/updatecustomer/{id}")
    public Customer updateCustomer(@RequestBody Customer customer, @PathVariable String id){
        return customerService.updateCustomer(customer,id);
    }

    @DeleteMapping("/deletecustomer")
    public String deleteCustomerData(@RequestParam String id){
        return customerService.deleteCustomer(id);
    }

}
