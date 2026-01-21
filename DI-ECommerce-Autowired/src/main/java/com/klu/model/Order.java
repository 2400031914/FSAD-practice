package com.klu.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Order {
	private int orderId;
	private String customerName;
	private int quantity;
	private String category;
	
	@Autowired
	private Product product;
	
	public Order() {
		this.orderId=2007;
		this.customerName="Indrani";
		this.quantity=3;
		this.category="Electronics";
		
	}
	public void display() {
		System.out.println("The following are the");
		System.out.println("OrderId:"+orderId);
		System.out.println("CustName:"+customerName);
		System.out.println("Quantity:"+quantity);
		System.out.println("Category:"+category);
		System.out.println("Product ID: " +product.getProductId());
		System.out.println("Product Name: " + product.getproductName());
		System.out.println("Price: " +product.getprice());
		System.out.println("Category: " +product.getcategory());
		

		
	}

}