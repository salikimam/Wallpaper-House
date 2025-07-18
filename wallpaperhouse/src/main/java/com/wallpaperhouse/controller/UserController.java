package com.wallpaperhouse.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.wallpaperhouse.entity.User;
import com.wallpaperhouse.service.UserService;

@Controller
public class UserController {
	@Autowired
	UserService userservice;
	
	@GetMapping("/register-page")
	public String registerPage() {
		return "register";
	}
	
	@PostMapping("/register")
	public String registerUser(@RequestParam("username")String username,@RequestParam("password")String password,
			Model model, RedirectAttributes redirectAttributes) {
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setRole("USER");
		String result = userservice.registeruser(user);
		if("User Registered Successfully".equals(result)) {
			redirectAttributes.addFlashAttribute("success", "Registration Successful! Please Login");
			return "redirect:/login";
		}
		else {
			model.addAttribute("error","Registration Failed! Try Again");
			return "redirect:/register";
		}	
	}
	
	@GetMapping("/login")
	public String loginPage() {
	    return "login"; 
	}
	
	@PostMapping("/login")
	public String loginUser(@RequestParam("username")String username,@RequestParam("password")String password,
			HttpSession session, RedirectAttributes redirectAttributes) {
		User user = userservice.login(username, password);
		if(user!=null) {
			session.setAttribute("loggedUser", user);
			if(user.getRole().equals("ADMIN")) {
				return "redirect:/admindashboard";
			}
			else {
				return "redirect:/home";
			}
		}
		else {
			redirectAttributes.addFlashAttribute("error","Invalid username or password");
			return "redirect:/login";
		}
		
	}
	
	@GetMapping("/logout")
	public String Logout(HttpSession session, RedirectAttributes redirectAttributes) {
		session.invalidate();
		redirectAttributes.addFlashAttribute("message", "You have been logged out successfully");
		return "redirect:/home";
	}

}
