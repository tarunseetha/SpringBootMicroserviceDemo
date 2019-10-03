package com.seetha.ProductCategoryEurekaClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

import com.seetha.controllers.ProductCategoryController;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackageClasses=ProductCategoryController.class)
public class ProductCategoryEurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductCategoryEurekaClientApplication.class, args);
	}

}
