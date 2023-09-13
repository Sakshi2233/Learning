package com.ey.shop;

import java.util.ArrayList;

public class ShoppingCart {
	
//Array to LinkedList
	private ArrayList<Product> products;
	
	private double total;
	private int index;
	
	public ShoppingCart() {
		products=new ArrayList< Product>();
		
	}
//  public void addtoCart(Product p) throws CartException {
//	  if(index==products.length)
//			  throw new CartException("Your Cart is full..");
//	  else
//	  {
//		  products[index]=p;
//		  index++;
//		  total+=p.getPrice();
//	  }
//  }
	
	public void addtoCart(Product p) {
		products.add(p);
	    total+=p.getPrice();
	}
	
	
  public void checkout()  {
	  System.out.println("Your order Summary...");
	  
	  products.forEach(System.out::println); 
		 
		  
		  System.out.println("Total Amount: " + total);
	  
	  
  }
}
