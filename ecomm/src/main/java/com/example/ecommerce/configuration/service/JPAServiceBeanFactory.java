package com.example.ecommerce.configuration.service;

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
	public ProductService productServiceBeanProvide() {
		return new ProductServiceV1();
	}

	@Bean
	public CategoryService categoryServiceBeanProvider() {
		return new CategoryServiceV1();
	}

	@Bean
	public UseCaseService useCaseServiceBeanProvider() {
		return new UseCaseServiceV1();
	}
}
