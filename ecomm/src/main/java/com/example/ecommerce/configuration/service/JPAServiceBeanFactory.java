package com.example.ecommerce.configuration.service;

import com.example.ecommerce.repository.jpa.CategoryRepository;
import com.example.ecommerce.repository.jpa.ProductRepository;
import com.example.ecommerce.repository.jpa.UseCaseRepository;
import com.example.ecommerce.service.CategoryService;
import com.example.ecommerce.service.ProductService;
import com.example.ecommerce.service.UseCaseService;
import com.example.ecommerce.service.jpa.CategoryServiceV1;
import com.example.ecommerce.service.jpa.ProductServiceV1;
import com.example.ecommerce.service.jpa.UseCaseServiceV1;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(name = "spring.datasource.access-mode", havingValue = "jpa")
public class JPAServiceBeanFactory {

	@Bean
	public ProductService productServiceBeanProvide(
			ProductRepository productRepository,
			UseCaseService useCaseService,
			CategoryService categoryService) {
		return new ProductServiceV1(productRepository, useCaseService, categoryService);
	}

	@Bean
	public CategoryService categoryServiceBeanProvider(CategoryRepository categoryRepository) {
		return new CategoryServiceV1(categoryRepository);
	}

	@Bean
	public UseCaseService useCaseServiceBeanProvider(UseCaseRepository useCaseRepository) {
		return new UseCaseServiceV1(useCaseRepository);
	}
}
