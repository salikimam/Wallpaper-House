package com.wallpaperhouse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.wallpaperhouse.entity.Product;
import com.wallpaperhouse.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	ProductService productservice;
	
	@GetMapping("/home")
	public String home() {
		return "index";
	}
	
	@GetMapping("/admindashboard")
	public String adminDashboard() {
		return "admindashboard";
	}
	
	@GetMapping("/insert-product")
	public String insertpage() {
		return "insert";
	}
	
	@PostMapping("/add-product")
	public String addproduct(@ModelAttribute Product p, Model model) {
		String msg = productservice.addproduct(p);
		System.out.println(msg);
		model.addAttribute("data",msg);
		return "redirect:/display-product";
	}
	
	@GetMapping("/display-product")
	public String displayproduct(Model model) {
		List<Product> allproduct = productservice.displayproduct();
		model.addAttribute("data",allproduct);
		return "display";
	}
	
	@GetMapping("/delete-product")
	public String deleteproduct(@RequestParam("id") int pk) {
		String msg = productservice.deleteproduct(pk);
		return "redirect:/display-product";
	}
	
	@GetMapping("/update-product")
	public String updatepage(@RequestParam("id")int pk,Model model) {
		Product obj = productservice.getProduct(pk);
		model.addAttribute("data",obj);
		return "update";
	}
	
	@PostMapping("/update-product")
	public String updateproduct(@ModelAttribute Product obj) {
		String msg = productservice.updateproduct(obj);
		return "redirect:/display-product";
	}
	
	@GetMapping("/all-product")
	public String allproduct(Model model) {
		List<Product> pro = productservice.allproduct();
		model.addAttribute("data",pro);
		return "products";
	}
}
