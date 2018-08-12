package com.ibm.southside4u.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.ibm.southside4u.service.IProductService;
import com.ibm.southside4u.utils.CustomLogger;

public class ProductServiceImpl implements IProductService {

@Autowired
CustomLogger logger;
	@Override
	public void getAllProducts() {
		String methodName = "getAllProducts";
		logger.methodEntryLogger(ProductServiceImpl.class, methodName);
	}

	@Override
	public void getProductsAttrByName(String name) {

	}

	@Override
	public void getProductsAttrById(Integer id) {

	}

	@Override
	public void getProductsAttrByType(String type) {

	}

}
