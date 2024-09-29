package com.example.ecommerce.service.jpa;

import com.example.ecommerce.dto.request.ProductRequest;
import com.example.ecommerce.entity.Category;
import com.example.ecommerce.entity.Product;
import com.example.ecommerce.entity.UseCase;
import com.example.ecommerce.repository.jpa.ProductRepository;
import com.example.ecommerce.service.CategoryService;
import com.example.ecommerce.service.ProductService;
import com.example.ecommerce.service.UseCaseService;
import jakarta.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.StreamSupport;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
public class ProductServiceV1 implements ProductService {

	@Autowired private ProductRepository productRepository;

	@Autowired private UseCaseService useCaseService;

	@Autowired private CategoryService categoryService;

	@Override
	public List<Product> findAllProducts() {
		List<Product> products =
				StreamSupport.stream(productRepository.findAll().spliterator(), false).toList();
		return products;
	}

	@Override
	public Product findProductById(Integer id) {
		Product product = productRepository.findById(id).orElse(null);
		return product;
	}

	@Override
	public List<Product> findProductByCategoryId(Integer categoryId) {
		List<Product> products = productRepository.findByCategoryId(categoryId);
		return products;
	}

	@Override
	@Transactional
	public Product saveProduct(ProductRequest productRequest) {
		List<UseCase> existingUseCases =
				useCaseService.findAllUseCasesByIds(productRequest.getExistingUseCases());
		List<UseCase> addedUseCases =
				useCaseService.saveAllUseCases(productRequest.getAddedUseCases());
		List<UseCase> useCases = new ArrayList<>();
		useCases.addAll(existingUseCases);
		useCases.addAll(addedUseCases);
		Category category = categoryService.findCategoryById(productRequest.getCategoryId());
		Product product = new Product();
		product.setCategory(category);
		product.setUseCases(useCases);
		product.setName(productRequest.getName());
		product.setPrice(productRequest.getPrice());
		Product savedProduct = productRepository.save(product);
		return savedProduct;
	}
}
