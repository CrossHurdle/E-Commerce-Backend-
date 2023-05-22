package com.example.CustomerEurekaServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CustomerEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerEurekaServerApplication.class, args);
	}

}
