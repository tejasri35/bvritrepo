package com.cg.pms.service;
import java.util.List;

import com.cg.pms.dao.ProductDao;
import com.cg.pms.dao.ProductDaoImpl;
import com.cg.pms.bean.Product;
import com.cg.pms.exception.ProductException;
public class ProductServiceImpl implements ProductService{

	private ProductDao productDao;
	public ProductServiceImpl() {
		productDao=new ProductDaoImpl();
	}
	@Override
	public boolean validateName(String productName) {
		if(ProductName.matches("[a-zA-Z]+")) {
			return true;
		}
		
		return false;
		
	}
	@Override
	public int addEmployee(Product product) throws ProductException {
		// TODO Auto-generated method stub
		return 0;
	}

	public Product findProductId(int productId) throws ProductException {
		// TODO Auto-generated method stub
		return null;
	}

	public Product deleteProductId(int productId) throws ProductException {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Product> findAllProduct() throws ProductException {
		// TODO Auto-generated method stub
		return null;
	}

	
}
