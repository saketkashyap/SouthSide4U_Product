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
import com.ibm.southside4u.so.ProductInfo;
import com.ibm.southside4u.so.ProductRequest;
import com.ibm.southside4u.utils.CustomLogger;

@RestController

public class ProductControllerImpl implements IProductController {

	@Autowired
	CustomLogger logger;
	
	@Autowired
	IProductService prodService;
	@Override
	public ResponseEntity<List<ProductInfo>> getAllProducts() {
		String methodName = "getAllProducts";
		logger.methodEntryLogger(ProductControllerImpl.class, methodName);
		List<Product> product= prodService.getAllProducts();
		 List<ProductInfo> productInfoList = new ArrayList<>();
		for(Product prod :product )
		{
			ProductInfo info = new ProductInfo();
			info.setProductId(prod.getId());
			info.setProductName(prod.getProductname());
			info.setProductType(prod.getProducttype());
			productInfoList.add(info);
		}
		return ResponseEntity.status(HttpStatus.OK).body(productInfoList);
		
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

	@Override
	public Product saveNewProduct(@RequestBody @Valid ProductRequest product) {
		Product prod = prodService.saveNewProduct(product);
		return prod;
		
	}

}
