package com.example.CustomerServiceOne.Model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("CustomerDetails")
public class Customer {
    @Id
    private String customer_id;
    private String firstname;

    private String lastname;
    private String streetaddress;

    private String town;
    private String postcode;
    private String state;
    private String country;
    private String emailaddress;


}
