package com.example.ecommerce.service.jpa;

import com.example.ecommerce.dto.request.CategoryRequest;
import com.example.ecommerce.entity.Category;
import com.example.ecommerce.repository.jpa.CategoryRepository;
import com.example.ecommerce.service.CategoryService;
import java.util.List;
import java.util.stream.StreamSupport;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
public class CategoryServiceV1 implements CategoryService {

	@Autowired private CategoryRepository categoryRepository;

	@Override
	public List<Category> findAllCategories() {
		List<Category> categories =
				StreamSupport.stream(categoryRepository.findAll().spliterator(), false).toList();
		log.info("Successfully fetched the Category {}", categories);
		return categories;
	}

	@Override
	public Category findCategoryById(Integer id) {
		Category category = categoryRepository.findById(id).orElse(null);
		return category;
	}

	@Override
	public Category saveCategory(CategoryRequest category) {
		Category category2 = new Category();
		category2.setName(category.getName());
		Category category1 = categoryRepository.save(category2);
		return category1;
	}
}
