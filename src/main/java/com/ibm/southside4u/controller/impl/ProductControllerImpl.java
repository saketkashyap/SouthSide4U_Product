package com.ibm.southside4u.controller.impl;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.southside4u.controller.IProductController;
import com.ibm.southside4u.model.Product;
import com.ibm.southside4u.service.IProductService;
import com.ibm.southside4u.so.ProductRequest;
import com.ibm.southside4u.utils.CustomLogger;

@RestController

public class ProductControllerImpl implements IProductController {

	@Autowired
	CustomLogger logger;
	
	@Autowired
	IProductService prodService;
	@Override
	public ResponseEntity<List<Product>> getAllProducts() {
		String methodName = "getAllProducts";
		logger.methodEntryLogger(ProductControllerImpl.class, methodName);
		List<Product> product= prodService.getAllProducts();
		return ResponseEntity.status(HttpStatus.OK).body(product);
		
	}

	@Override
	public ResponseEntity<List<Product>> getProductsAttrByName(@PathVariable("name")  String name) {
		String methodName = "getProductsAttrByName";
		List<Product> prod = new ArrayList<>();
		try
		{
			 prod = prodService.getProductsAttrByName(name);
			 return ResponseEntity.status(HttpStatus.OK).body(prod);
		}
	
		catch(Exception e)
		{
			logger.exceptionLogger(ProductControllerImpl.class, methodName, e.getMessage());
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(prod);
			
		}
		
	}

	@Override
	public void getProductsAttrById(@PathVariable("id") Integer id) {

	}

	@Override
	public void getProductsAttrByType(@PathVariable("type") String type) {
		

	}

	@Override
	public Product saveNewProduct(@RequestBody @Valid ProductRequest product) {
		Product prod = prodService.saveNewProduct(product);
		return prod;
		
	}

}
