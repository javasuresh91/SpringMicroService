package com.jpa.command;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jpa.entities.User;
import com.jpa.service.UserDAOService;

@Component
public class UserDaoServiceCmdLine implements CommandLineRunner {
	
	@Autowired
	private UserDAOService service;

	public void run(String... arg0) throws Exception {
		User user = new User("Suresh", "Tech");
		long id = service.insert(user);
		System.out.println(id);
		
	}

}
