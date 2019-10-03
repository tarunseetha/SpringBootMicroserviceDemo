package com.seetha.models;

public class ProductCategory {
	
	public ProductCategory() {
		super();
	}
	
	private int productId;
	private int categoryId;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

}
