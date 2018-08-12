package com.ibm.southside4u.so;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter
@Setter
@NoArgsConstructor
public class ProductInfoResponse {

	private List<ProductInfo> productInfoList;
	
	public ProductInfoResponse(List<ProductInfo> productInfoList)
	{
		this.productInfoList = productInfoList;
	}
}
