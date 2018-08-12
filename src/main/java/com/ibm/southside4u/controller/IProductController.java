package com.ibm.southside4u.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ibm.southside4u.so.ProductInfoResponse;

@RequestMapping(value="/soutside4u/product")
public interface IProductController {


	@RequestMapping(value="/getAll",method=RequestMethod.GET)
	public ProductInfoResponse getAllProducts();
	
	@RequestMapping(value="/getByName/{name}",method=RequestMethod.GET)
	public void getProductsAttrByName(@PathVariable("name") String name);
	
	@RequestMapping(value="/getByName/{id}",method=RequestMethod.GET)
	public void getProductsAttrById(@PathVariable("id") Integer id);
	
	@RequestMapping(value="/getByName/{type}",method=RequestMethod.GET)
	public void getProductsAttrByType(@PathVariable("type") String type);
}
