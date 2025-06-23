package com.productmanagementsystem.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productmanagementsystem.model.Product;
import com.productmanagementsystem.repository.ProductRepo;
@Service
public class ProductService {
	 @Autowired 
	ProductRepo productRepo;
	//create a product 
	public Product createProduct(Product product) {
		return productRepo.save(product);
		
	}
	
	//get all products 
	public List<Product> getAllProducts(){
		return productRepo.findAll();
	}


}
