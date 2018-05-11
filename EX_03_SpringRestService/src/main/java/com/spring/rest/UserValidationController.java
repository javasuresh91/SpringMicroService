package com.spring.rest;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rest.bean.User;
import com.spring.rest.service.UserDaoService;

@RestController
public class UserValidationController {
	
	
	@Autowired
	private UserDaoService userDao;
	
	//http://localhost:8080/addUserWithValidation
	@PostMapping("/addUserWithValidation")
	public void createUser(@Valid @RequestBody User user) {
		userDao.add(user);
	}

}
