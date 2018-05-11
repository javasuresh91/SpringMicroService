package com.spring.rest;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rest.bean.User;
import com.spring.rest.service.UserDaoService;

@RestController
public class HATEOASController {
	
	@Autowired
	private UserDaoService userservice;

	@GetMapping("/hateoasLink/{id}")
	public Resource<User> getUserWithHateoasLink(@PathVariable int id) {
		
		User user = userservice.findUser(id);
		
		Resource<User> resource = new Resource<User>(user);
		ControllerLinkBuilder linkInto = linkTo(methodOn(UserCURDController.class).getAllUsers());
		
		resource.add(linkInto.withRel("hateoas-link"));
		return resource;
	}
}
