package com.ibm.southside4u.service;

import java.util.List;

import com.ibm.southside4u.model.Product;
import com.ibm.southside4u.so.ProductRequest;

public interface IProductService {

	
	public List<Product> getAllProducts() ;

	
	public void getProductsAttrByName(String name);

	
	public void getProductsAttrById(Integer id);

	
	public void getProductsAttrByType(String type);
	
	public Product saveNewProduct(ProductRequest product);
}
