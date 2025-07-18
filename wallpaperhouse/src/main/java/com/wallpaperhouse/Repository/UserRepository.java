package com.wallpaperhouse.Repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wallpaperhouse.entity.User;

@Repository
public class UserRepository {
	
	@Autowired
	SessionFactory sessionfactory;
	public String registeruser(User user) {
		Session session = sessionfactory.openSession();
		Transaction tx = session.beginTransaction();
		try {
			session.save(user);
			tx.commit();
			session.close();
			return "User Registered Successfully";
		}
		catch(Exception e) {
			e.printStackTrace();
			return "Registration Failed";
		}
		
	}
	public User login(String username, String password) {
		Session session = sessionfactory.openSession();
		User user = null;
		
		try {
			user = (User) session.createNativeQuery("SELECT * FROM user WHERE BINARY username = :username AND BINARY password = :password",User.class)
			.setParameter("username", username)
			.setParameter("password", password)
			.uniqueResult();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			session.close();
		}
		return user;
	}

}
