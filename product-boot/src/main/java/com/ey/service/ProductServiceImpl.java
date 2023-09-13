package com.ey.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ey.entity.Product;
import com.ey.repo.ProductRepository;


@Service              
public class ProductServiceImpl implements ProductService {
@Autowired

private ProductRepository repo;

public int save(Product p) {
	repo.save(p);
	return p.getCode();
	}

@Override
public List<Product> list() {
	
	return repo.findAll();
}

@Override
public Product findByCode(int code) {
	
	return repo.findById(code).get();
}

@Override
public void delete(int code) {
	repo.deleteById(code);
	
}


@Override
public List<Product> findByCategory(String category) {
return repo.findByCategory(category);
}

@Override
public List<Product> ByPriceRange() {
	return repo.findByPriceDesc();
}

@Override
public List<Product> findByPriceLowtoHigh(double min, double max) {
	return repo.findByPriceRange(min, max);
}









	
	

	

	

	
	

}
