package com.ey.repo;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ey.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	//Product findByCode(int code);
	
	@Query("FROM Product where price BETWEEN :min AND :max")
	List <Product> findByPriceRange(double min, double max);
	
	List <Product> findByCategory(String Category);
	
	
	@Query("From Product order by price DESC")
	List <Product> findByPriceDesc();
	
	
	
	
	
	

}
