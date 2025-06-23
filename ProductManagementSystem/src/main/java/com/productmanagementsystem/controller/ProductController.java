package com.productmanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.productmanagementsystem.model.Product;
import com.productmanagementsystem.service.ProductService;

@RestController
public class ProductController {
	@Autowired
		ProductService productService;
	
	@PostMapping ("api/product")
	public Product createProduct(@RequestBody Product product) {
		return productService.createProduct(product);
	}
	
	//get all products 
	@GetMapping("api/product")
		public List<Product> getProducts(){
			return productService.getAllProducts();
		}
	
}
