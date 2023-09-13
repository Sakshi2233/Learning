package com.ey.service;

import java.util.List;

import com.ey.entity.Product;

public interface ProductService {
	
	int save (Product p);
	
	List<Product>list();
	
	Product findByCode(int code);
	
	List<Product> ByPriceRange();
	
	List<Product> findByCategory(String category);
	
	List<Product> findByPriceLowtoHigh(double min, double max);
	
	void delete(int code);

	
	

}
