package com.ibm.southside4u.so;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ProductInfo {

	private Integer productId;
	private String productType;
	private String productName;
	
public ProductInfo(Integer productId,String productType,String productName)
{
	this.productId=productId;
	this.productName=productName;
	this.productType=productType;
}
	
	
}
