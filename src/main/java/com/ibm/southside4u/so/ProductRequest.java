package com.ibm.southside4u.so;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

public class ProductRequest {
	@NotNull
	@NotEmpty
	private String productType;
	@NotNull
	@NotEmpty
	private String productName;
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	
}
