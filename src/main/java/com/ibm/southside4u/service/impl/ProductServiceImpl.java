package com.ibm.southside4u.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.southside4u.model.Product;
import com.ibm.southside4u.repository.IProductRepository;
import com.ibm.southside4u.service.IProductService;
import com.ibm.southside4u.so.ProductRequest;
import com.ibm.southside4u.utils.CustomLogger;

@Service
public class ProductServiceImpl implements IProductService {

@Autowired
CustomLogger logger;
@Autowired
IProductRepository prodRepo;
	@Override
	public List<Product> getAllProducts() {
		String methodName = "getAllProducts";
		logger.methodEntryLogger(ProductServiceImpl.class, methodName);
		List<Product> productList = (List<Product>) prodRepo.findAll();
		
		return productList;
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

	@Override
	public Product saveNewProduct(ProductRequest product) {
		Product prod = new Product();
		prod.setProductname(product.getProductName());
		prod.setProducttype(product.getProductType());
		prod = prodRepo.save(prod);
		return prod;
	}

}
