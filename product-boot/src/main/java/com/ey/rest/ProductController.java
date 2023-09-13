package com.ey.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ey.entity.Product;
import com.ey.service.ProductService;

@CrossOrigin     
@RestController
@RequestMapping(value="/product")
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	//http://localhost:8880/product/add
	@PostMapping(value = "/add", consumes = "application/json")
	public String add(@RequestBody Product p) {    
	 int code=	service.save(p);
		return "Product added with code";
	}
	
	//http://localhost:8880/product/list
	@GetMapping(value = "/list", produces = "application/json")
	public List<Product> list() {
		return service.list();
	}
	
	//http://localhost:8880/product/123
	@GetMapping(value = "/{code}")
	public Product find(@PathVariable int code) {
		return service.findByCode(code);
	}
	
	//http://localhost:8880/product/123
		
		@DeleteMapping(value = "/{code}")
		public String remove(@PathVariable int code) {
	         service.delete(code);
	         return "Product Deleted";
		}
		
		}
	
	
		
	
	


