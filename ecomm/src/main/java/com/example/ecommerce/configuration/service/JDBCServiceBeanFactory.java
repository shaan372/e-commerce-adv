package com.example.ecommerce.configuration.service;

import com.example.ecommerce.service.CategoryService;
import com.example.ecommerce.service.ProductService;
import com.example.ecommerce.service.UseCaseService;
import com.example.ecommerce.service.jdbc.CategoryServiceV2;
import com.example.ecommerce.service.jdbc.ProductServiceV2;
import com.example.ecommerce.service.jdbc.UseCaseServiceV2;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(name = "spring.datasource.access-mode", havingValue = "jdbc")
public class JDBCServiceBeanFactory {

	@Bean
	public ProductService productServiceBeanProvide() {
		return new ProductServiceV2();
	}

	@Bean
	public CategoryService categoryServiceBeanProvider() {
		return new CategoryServiceV2();
	}

	@Bean
	public UseCaseService useCaseServiceBeanProvider() {
		return new UseCaseServiceV2();
	}
}
