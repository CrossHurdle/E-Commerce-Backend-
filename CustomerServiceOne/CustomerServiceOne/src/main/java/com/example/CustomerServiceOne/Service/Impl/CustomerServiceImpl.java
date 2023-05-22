package com.example.CustomerServiceOne.Service.Impl;
import com.example.CustomerServiceOne.Model.Customer;
import com.example.CustomerServiceOne.Repository.CustomerRepository;
import com.example.CustomerServiceOne.Service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Override
    public Customer createCustomer(Customer customer){
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> getAllCustomer(){
        return customerRepository.findAll();
    }

    @Override
    public Customer updateCustomer(Customer customer,String id){
        Optional<Customer> customer1=customerRepository.findById(id);
        if(customer1.isPresent()){
            customer1.get().setFirstname(customer.getFirstname());
            customer1.get().setLastname(customer.getLastname());
            customer1.get().setStreetaddress(customer.getStreetaddress());
            customer1.get().setTown(customer.getTown());
            customer1.get().setCountry(customer.getCountry());
            customer1.get().setPostcode(customer.getPostcode());
            customer1.get().setEmailaddress(customer.getEmailaddress());
        } else
        {
            throw new IllegalStateException("please enter valid id");
        }
        return customerRepository.save(customer1.get());
    }
    @Override
    public String deleteCustomer(String id){
        customerRepository.deleteById(id);
        return "sucessfully deleted";
    }


}
