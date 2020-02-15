package com.cg.pms.bean;

public class Product {
	private int productId;
	private String productName;
	private double salary;
	public Product(int productId, String productName, double salary) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.salary = salary;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
	
}
