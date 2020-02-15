package com.cg.pms.service;

import java.util.List;

import com.cg.pms.bean.Product;
import com.cg.pms.exception.ProductException;

public interface ProductService {

	public boolean validateName(String employeeName);
	public int addEmployee(Product product) throws ProductException;
	public Product findProductId(int productId) throws ProductException;
	public Product deleteProductId(int productId) throws ProductException;
	public List<Product> findAllProduct() throws ProductException;
}
