package com.example.ecommerce.service;

import com.example.ecommerce.dto.request.ProductRequest;
import com.example.ecommerce.entity.Product;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface ProductService {
	List<Product> findAllProducts();

	Product findProductById(Integer id);

	List<Product> findProductByCategoryId(Integer categoryId);

	Product saveProduct(ProductRequest productRequest);
}
