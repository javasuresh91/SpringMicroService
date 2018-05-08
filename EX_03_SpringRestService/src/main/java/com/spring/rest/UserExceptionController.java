package com.spring.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rest.Exception.UserNotFoundException;
import com.spring.rest.bean.User;
import com.spring.rest.service.UserDaoService;

@RestController
public class UserExceptionController {

	@Autowired
	UserDaoService userDao;
	//http://localhost:8080/specificUserException/8
	@RequestMapping(path="/specificUserException/{id}" , method=RequestMethod.GET)
	public User getSpecificUser(@PathVariable int id) {
		User user = userDao.findUser(id);
		if(user == null)
			throw new UserNotFoundException("Invaild Search");
		return user;
	}
}
