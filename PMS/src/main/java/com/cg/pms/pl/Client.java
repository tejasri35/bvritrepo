package com.cg.pms.pl;

import java.util.*;
import java.util.Scanner;

import com.cg.ems.bean.Employee;
import com.cg.ems.exception.EmployeeException;
import com.cg.pms.bean.Product;
import com.cg.pms.exception.ProductException;
import com.cg.pms.service.ProductService;
import com.cg.pms.service.ProductServiceImpl;

public class Client {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ProductService productService = new ProductServiceImpl();
		int choice=0;
		Product product=null;
		List<Product> list=null;
		while(choice!=5) {

			System.out.println("1.Add Product");
			System.out.println("2.Search Product");
			System.out.println("3.Delete Product");
			System.out.println("4.List All Product");
			System.out.println("5.Exit");
			System.out.println("Enter your choice :");
			choice = sc.nextInt();
			sc.nextLine();
			switch(choice) {	
			case 1:
				System.out.println("Enter the name of the product");
				String name=sc.nextLine();
				System.out.println("Enter the salary of the product");
				double salary = sc.nextDouble();
				product = new Product();  
				product.setProductName(name);
				product.setSalary(salary);
				try {
				int id =productService.addProduct(product);
				System.out.println("employee ID = "+id);
				}
				catch(ProductException e) {
					System.err.println(e.getMessage());
				}
				break;
			}