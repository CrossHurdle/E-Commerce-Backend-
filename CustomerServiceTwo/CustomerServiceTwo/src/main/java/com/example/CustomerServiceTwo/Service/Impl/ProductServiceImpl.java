package com.example.CustomerServiceTwo.Service.Impl;

import com.example.CustomerServiceTwo.Model.Product;
import com.example.CustomerServiceTwo.Repository.ProductRepository;
import com.example.CustomerServiceTwo.Service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public Product createProduct(Product product){ return productRepository.save(product);}

    @Override
    public List<Product> getAllProduct(){ return productRepository.findAll();}

    @Override
    public Product updateProduct(Product product,String id){
        return productRepository.save(product);
    }

    @Override
    public String deleteProduct(String id){
        productRepository.deleteById(id);
        return "sucessfully Deleted";
    }

}
