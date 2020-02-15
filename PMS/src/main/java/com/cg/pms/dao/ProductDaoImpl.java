package com.cg.pms.dao;
import java.util.*;

import com.cg.pms.bean.Product;
import com.cg.pms.exception.ProductException;
import com.cg.pms.bean.Product;
import com.cg.pms.exception.ProductException;

public class ProductDaoImpl implements ProductDao{
	
	private Map<Integer,Product> map ;
	public ProductDaoImpl() {
		map=new HashMap<Integer,Product>();
	}
	public int addProduct(Product product) throws ProductException {
		if(map.containsKey(product.getProductId())) {
			throw new ProductException("Id already Exists");
		}
		map.put(product.getProductId(), product);
		return product.getProductId();
		
	}
	public Product findProductId(int productId) throws ProductException {
		Product product =null;
		if(!map.containsKey(productId)) {
			throw new ProductException("Id doesn't exists");
		}
		product=map.get(productId);
		return product;
		}
	
	public Product deleteProductId(int productId) throws ProductException {
		Product product =null;
		if(!map.containsKey(productId)) {
			throw new ProductException("Id doesn't exists");
		}
		product=map.remove(productId);
	
		return product;
		}
	
	public List<Product> findAllProduct() throws ProductException {
		Collection<Product> coll =map.values();
		List<Product> list = new ArrayList<Product>(coll);
		if(coll.isEmpty()) {
			throw new ProductException(" No Employees details are found");
		}
//		for(Product e : list) {
//			list.add(e);
//		}
		return list;
	}



}
