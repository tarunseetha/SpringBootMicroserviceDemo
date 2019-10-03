package com.seetha.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.seetha.models.ProductCategory;

@RestController
public class TestController {
	
	@Autowired
    private RestTemplate restTemplate;
	
	private String serviceUrl = "http://PRODUCT-CATEGORY-MICROSERVICE";
	
	@RequestMapping(value="/list", method = RequestMethod.GET)
	public ProductCategory showAllProductCategories(){
		
		System.out.println("Inside /list");
		
		ProductCategory pc = new ProductCategory();
		
		pc = restTemplate.getForObject(serviceUrl + "/product-category-list", ProductCategory.class);

		return pc;
	}

}
