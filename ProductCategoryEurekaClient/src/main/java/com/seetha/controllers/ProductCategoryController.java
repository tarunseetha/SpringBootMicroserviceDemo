package com.seetha.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seetha.models.ProductCategory;

@RestController
public class ProductCategoryController {
	
	@RequestMapping("/product-category-list")
	public ProductCategory showAllProductCategories(){
		System.out.println("Flow reached here..........");
		ProductCategory pc = new ProductCategory();
		pc.setProductId(1);
		pc.setCategoryId(100);
		return pc;
	}

}
