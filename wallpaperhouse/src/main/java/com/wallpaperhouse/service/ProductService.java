package com.wallpaperhouse.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wallpaperhouse.dao.ProductRepository;
import com.wallpaperhouse.entity.Product;

@Service
public class ProductService {
	@Autowired
	ProductRepository productrepository;
	
	public String addproduct(Product p) {
		String msg = productrepository.addproduct(p);
		return msg;
	}

	public List<Product> displayproduct() {
		List<Product>allproduct = productrepository.displayproduct();
		return allproduct;
	}

	public String deleteproduct(int pk) {
		String msg = productrepository.deleteproduct(pk);
		return msg;
	}

	public Product getProduct(int pk) {
		Product obj = productrepository.getProduct(pk);
		return obj;
	}

	public String updateproduct(Product obj) {
		String msg = productrepository.updateproduct(obj);
		return msg;
	}

	public List<Product> allproduct() {
		List<Product>pro = productrepository.allproduct();
		return pro;
	}
}
