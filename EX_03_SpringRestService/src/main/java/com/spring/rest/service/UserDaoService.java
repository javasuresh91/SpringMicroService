package com.spring.rest.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

import com.spring.rest.bean.User;

@Component
public class UserDaoService {

	private static List<User> user = new ArrayList<>();
	
	static {
		user.add(new User(1,"Sure", new Date()));
		user.add(new User(2,"xxx", new Date()));
		user.add(new User(3,"Jsp", new Date()));
	}
	
	public List<User> findAll() {
		return user;
	}
	
	public User findUser(int userId) {
		for(User u:user) {
			if(u.getId()== userId) {
				return u;
			}
		}
		return null;
	}
	
	public User add(User userData) {
		if(userData.getId() == null) {
			userData.setId(user.size());
		}
		user.add(userData);
		
		return userData;
	}
	
	public User deleteUser(int userId) {
		Iterator<User> deletedata = user.iterator();
		while (deletedata.hasNext()) {
			User data = deletedata.next();
			if(data.getId()==userId)
			{
				deletedata.remove();
				return data;
			}
		}
		
		
		
		return null;
	}
	
}
