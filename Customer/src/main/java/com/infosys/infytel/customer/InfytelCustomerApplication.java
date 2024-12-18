package com.infosys.infytel.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class InfytelCustomerApplication {
	public static void main(String[] args) {
		SpringApplication.run(InfytelCustomerApplication.class, args);
	}
}