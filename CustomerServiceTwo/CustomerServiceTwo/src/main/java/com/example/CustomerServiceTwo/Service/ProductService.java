package com.example.CustomerServiceTwo.Service;

import com.example.CustomerServiceTwo.Model.Product;

import java.util.List;

public interface ProductService {

    public Product createProduct(Product product);

    List<Product> getAllProduct();

    Product updateProduct(Product product,String id);

    String deleteProduct(String id);
}
