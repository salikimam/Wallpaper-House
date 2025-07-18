package com.wallpaperhouse.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wallpaperhouse.entity.Product;

@Repository
public class ProductRepository {
	@Autowired
	SessionFactory sessionfactory;
	
	public String addproduct(Product p) {
		System.out.println(p);
		try {
			Session session = sessionfactory.openSession();
			Transaction tx = session.beginTransaction();
			session.save(p);
			tx.commit();
			session.close();
			return "Product Added Successfully";
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return "Something went wrong";
	}
	
	public List<Product> displayproduct() {
		Session session = sessionfactory.openSession();
		@SuppressWarnings("deprecation")
		Criteria criteria = session.createCriteria(Product.class);
		@SuppressWarnings("unchecked")
		List<Product>allproduct = criteria.list();
		session.close();
		return allproduct;
	}

	public String deleteproduct(int pk) {
		Session session = sessionfactory.openSession();
		Transaction tx = session.beginTransaction();
		Product product = session.get(Product.class, pk);
		if(product != null)
		{
			session.delete(product);
			tx.commit();
			session.close();
			return "product deleted successfully";
		}
		else {
			return "Product not deleted";
		}
		
	}

	public Product getProduct(int pk) {
		Session session = sessionfactory.openSession();
		Product product = session.get(Product.class, pk);
		session.close();
		return product;
	}

	public String updateproduct(Product obj) {
		Session session = sessionfactory.openSession();
		Transaction tx = session.beginTransaction();
		//Product prod = session.get(Product.class, obj.getId());
		session.update(obj);
		tx.commit();
		session.close();
		return "Product Updated Successfully";
	}

	public List<Product> allproduct() {
		Session session = sessionfactory.openSession();
		@SuppressWarnings("deprecation")
		Criteria criteria = session.createCriteria(Product.class);
		@SuppressWarnings("unchecked")
		List<Product>pro = criteria.list();
		session.close();
		return pro;
	}
}
