package com.ibm.southside4u.so;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
@AllArgsConstructor
public class ProductInfoResponse {

	private List<ProductInfo> productInfoList;
	
	public ProductInfoResponse(List<ProductInfo> productInfoList)
	{
		this.productInfoList = productInfoList;
	}
}
