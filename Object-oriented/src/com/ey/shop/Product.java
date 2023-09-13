package com.ey.shop;

/**
 * java doc comment
 */

public class Product {
	private String name;
	private double price;
	/**
	 * DEfault constructor
	 */
	public Product() {
		

	}
  /**
   * this is the parameterized constructor
   * @param name
   * @param price
   */
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public void print() {
		System.out.println("Name: "+name + "\tPrice :" + price);
	}
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
	public double getPrice() {
		return price;
	}
	
}
