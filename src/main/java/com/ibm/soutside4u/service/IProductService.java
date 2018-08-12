package com.ibm.soutside4u.service;

public interface IProductService {

	
	public void getAllProducts() ;

	
	public void getProductsAttrByName(String name);

	
	public void getProductsAttrById(Integer id);

	
	public void getProductsAttrByType(String type);
}
