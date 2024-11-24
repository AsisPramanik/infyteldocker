package com.infosys.infytel.plan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class InfytelPlanApplication {
	public static void main(String[] args) {
		SpringApplication.run(InfytelPlanApplication.class, args);
	}
}