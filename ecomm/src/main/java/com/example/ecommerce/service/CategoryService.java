package com.example.ecommerce.service;

import com.example.ecommerce.dto.request.CategoryRequest;
import com.example.ecommerce.entity.Category;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface CategoryService {
	List<Category> findAllCategories();

	Category findCategoryById(Integer id);

	Category saveCategory(CategoryRequest category);
}
