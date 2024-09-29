package com.example.ecommerce.service.jdbc;

import com.example.ecommerce.dto.request.ProductRequest;
import com.example.ecommerce.entity.Product;
import com.example.ecommerce.service.ProductService;
import java.util.List;

public class ProductServiceV2 implements ProductService {
	@Override
	public List<Product> findAllProducts() {
		return List.of(new Product(1, "jdbc worked", 69.0, null, null));
	}

	@Override
	public Product findProductById(Integer id) {
		return null;
	}

	@Override
	public List<Product> findProductByCategoryId(Integer categoryId) {
		return null;
	}

	@Override
	public Product saveProduct(ProductRequest productRequest) {
		return null;
	}
}
