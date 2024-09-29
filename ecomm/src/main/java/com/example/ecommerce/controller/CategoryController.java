package com.example.ecommerce.controller;

import com.example.ecommerce.dto.request.CategoryRequest;
import com.example.ecommerce.entity.Category;
import com.example.ecommerce.service.CategoryService;
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
@RequestMapping("/category")
public class CategoryController {

	@Autowired CategoryService categoryService;

	@GetMapping("/all")
	public ResponseEntity<List<Category>> getAllCategories() {
		List<Category> categories = categoryService.findAllCategories();
		return new ResponseEntity<>(categories, HttpStatus.OK);
	}

	@GetMapping("/{categoryId}")
	public ResponseEntity<Category> getCategoryById(
			@PathVariable("categoryId") Integer categoryId) {
		Category category = categoryService.findCategoryById(categoryId);
		return new ResponseEntity<>(category, HttpStatus.OK);
	}

	@PostMapping("/save")
	public ResponseEntity<Category> saveCategory(@RequestBody CategoryRequest categoryRequest) {
		Category category = categoryService.saveCategory(categoryRequest);
		return new ResponseEntity<>(category, HttpStatus.OK);
	}
}
