package com.wallpaperhouse.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product",schema = "wallpaperhouse")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String productname;
	private int productquantity;
	private double productprice;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int id, String productname, int productquantity, double productprice) {
		super();
		this.id = id;
		this.productname = productname;
		this.productquantity = productquantity;
		this.productprice = productprice;
	}
	
	public Product(String productname, int productquantity, double productprice) {
		super();
		this.productname = productname;
		this.productquantity = productquantity;
		this.productprice = productprice;
	}
	public long getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public int getProductquantity() {
		return productquantity;
	}
	public void setProductquantity(int productquantity) {
		this.productquantity = productquantity;
	}
	public double getProductprice() {
		return productprice;
	}
	public void setProductprice(double productprice) {
		this.productprice = productprice;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", productname=" + productname + ", productquantity=" + productquantity
				+ ", productprice=" + productprice + "]";
	}
	
}
