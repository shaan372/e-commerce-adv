package com.example.ecommerce.repository.jpa;

import com.example.ecommerce.entity.Product;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {

	List<Product> findByCategoryId(Integer categoryId);
}
