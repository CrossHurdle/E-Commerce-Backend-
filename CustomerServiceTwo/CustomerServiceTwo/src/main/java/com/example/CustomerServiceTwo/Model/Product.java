package com.example.CustomerServiceTwo.Model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("Customer_Product_Details")
public class Product {
    @Id
    private String id;

    private String name;
    private String quantity;
    private String price;
}
