package com.example.CustomerServiceTwo.Controller;

import com.example.CustomerServiceTwo.Model.Product;
import com.example.CustomerServiceTwo.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/postproduct")
    public Product createProduct(@RequestBody Product product) { return productService.createProduct(product);}

    @GetMapping("/getproduct")
    public List<Product> getAllProduct() { return productService.getAllProduct();}

    @PutMapping("/updateproduct/{id}")
    public Product updateProduct(@RequestBody Product product, @PathVariable String id){
        return productService.updateProduct(product,id);
    }

    @DeleteMapping("/deleteproduct")
    public String deleteProductData(@RequestParam String id){
        return productService.deleteProduct(id);
    }
}
