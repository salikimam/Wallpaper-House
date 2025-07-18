package com.wallpaperhouse.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wallpaperhouse.Repository.UserRepository;
import com.wallpaperhouse.entity.User;

@Service
public class UserService {
	@Autowired
	UserRepository userrepository;
	
	public String registeruser(User user) {
		String result = userrepository.registeruser(user);
		return result ;
	}

	public User login(String username, String password) {
		User obj = userrepository.login(username,password);
		return obj;
	}
	
}
