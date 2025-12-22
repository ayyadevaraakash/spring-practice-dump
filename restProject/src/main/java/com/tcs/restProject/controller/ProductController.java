package com.tcs.restProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.restProject.bean.Product;
import com.tcs.restProject.dto.ProductAddedResponse;
import com.tcs.restProject.repository.ProductRepository;

@RestController
public class ProductController {

	@Autowired
	private ProductRepository productRepository;

	@PostMapping("/api/add")
	public ResponseEntity<ProductAddedResponse> addProduct(@RequestBody Product product) {
		Product savedProduct = productRepository.save(product);
		return ResponseEntity.status(201)
				.body(new ProductAddedResponse(savedProduct.getId(), "Data Added Successfully"));
	}
	
	@GetMapping("/api/fetch")
	public ResponseEntity<List<Product>> getProduct() {
		List<Product> ans = productRepository.findAll();
		return ResponseEntity.status(200).body(ans);
	}

}
