package com.ibm.southside4u.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ibm.southside4u.model.Product;
import com.ibm.southside4u.so.ProductInfo;
import com.ibm.southside4u.so.ProductRequest;

@RequestMapping(value="/soutside4u/product")
public interface IProductController {


	@RequestMapping(value="/save",method=RequestMethod.POST)
	public Product saveNewProduct(@RequestBody ProductRequest product);
	
	@RequestMapping(value="/getAll",method=RequestMethod.GET)
	public ResponseEntity<List<ProductInfo>> getAllProducts();
	
	@RequestMapping(value="/getByName/{name}",method=RequestMethod.GET)
	public void getProductsAttrByName(@PathVariable("nam;e") String name);
	
	
	@RequestMapping(value="/getByName/{id}",method=RequestMethod.GET)
	public void getProductsAttrById(@PathVariable("id") Integer id);
	
	@RequestMapping(value="/getByName/{type}",method=RequestMethod.GET)
	public void getProductsAttrByType(@PathVariable("type") String type);
}
