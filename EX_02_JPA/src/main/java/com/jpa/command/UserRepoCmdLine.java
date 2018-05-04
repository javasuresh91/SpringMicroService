package com.jpa.command;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jpa.entities.User;
import com.jpa.service.UserDAOService;
import com.jpa.spring.data.UserRepo;

@Component
public class UserRepoCmdLine implements CommandLineRunner {
	
	@Autowired
	private UserRepo repo;

	public void run(String... arg0) throws Exception {
		User user = new User("Suresh", "Repo");
		user = repo.save(user);
		System.out.println("Using Spring Data Repository : "+user);
		
	}

}
