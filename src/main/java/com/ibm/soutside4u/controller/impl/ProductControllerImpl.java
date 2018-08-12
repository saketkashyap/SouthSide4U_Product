package com.ibm.soutside4u.controller.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.southside4u.so.ProductInfo;
import com.ibm.southside4u.so.ProductInfoResponse;
import com.ibm.soutside4u.controller.IProductController;
import com.ibm.soutside4u.utils.CustomLogger;

@RestController
public class ProductControllerImpl implements IProductController {

	@Autowired
	CustomLogger logger;
	
	@Override
	public ProductInfoResponse getAllProducts() {
		String methodName = "getAllProducts";
		logger.methodEntryLogger(ProductControllerImpl.class, methodName);
		List<ProductInfo> customProductInfoList = new ArrayList<ProductInfo>();
		for (int i=0;i<=2;i++)
		{
			ProductInfo prodInfo = new ProductInfo(i,"Artifical_"+i,"Jwellery_"+i);
			customProductInfoList.add(prodInfo);
			
		}
		ProductInfoResponse resp = new ProductInfoResponse(customProductInfoList);
		return resp;
		
	}

	@Override
	public void getProductsAttrByName(@PathVariable("name") String name) {

		
	}

	@Override
	public void getProductsAttrById(@PathVariable("id") Integer id) {

	}

	@Override
	public void getProductsAttrByType(@PathVariable("type") String type) {
		

	}

}
