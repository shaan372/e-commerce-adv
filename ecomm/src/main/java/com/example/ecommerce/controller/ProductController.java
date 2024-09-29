package com.example.ecommerce.controller;

import com.example.ecommerce.dto.request.ProductRequest;
import com.example.ecommerce.entity.Product;
import com.example.ecommerce.service.ProductService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired private ProductService productService;

	@GetMapping("/all")
	ResponseEntity<List<Product>> findAll() {
		List<Product> products = productService.findAllProducts();
		return new ResponseEntity<>(products, HttpStatus.OK);
	}

	@GetMapping("/category/{categoryId}")
	ResponseEntity<List<Product>> findByCategoryId(@PathVariable Integer categoryId) {
		List<Product> products = productService.findProductByCategoryId(categoryId);
		return new ResponseEntity<>(products, HttpStatus.OK);
	}

	@GetMapping("/{productId}")
	public ResponseEntity<Product> findProductById(Integer productId) {
		Product product = productService.findProductById(productId);
		return new ResponseEntity<>(product, HttpStatus.OK);
	}

	@PostMapping("/save")
	public ResponseEntity<Product> saveProduct(@RequestBody ProductRequest productRequest) {
		Product product = productService.saveProduct(productRequest);
		return new ResponseEntity<>(product, HttpStatus.OK);
	}
}
