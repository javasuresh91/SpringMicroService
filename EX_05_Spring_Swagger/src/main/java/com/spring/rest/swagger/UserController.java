package com.spring.rest.swagger;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.spring.rest.swagger.dto.User;
import com.spring.rest.swagger.service.UserDaoService;

import io.swagger.annotations.ResponseHeader;

@RestController
public class UserController {
	
	@Autowired
	private UserDaoService userDao;
	
	//http://localhost:8080/users
	@RequestMapping(method=RequestMethod.GET,path="/users")
	public List<User> getAllUsers() {
		return userDao.findAll();
	}
	
	//http://localhost:8080/user/1
	@GetMapping("/user/{id}")
	public User getUserInfo(@PathVariable(name="id") int userId) {
		return userDao.findUser(userId);
	}
	
	//http://localhost:8080/addUser
	@PostMapping("/addUser")
	public void createUser(@RequestBody User user) {
		userDao.add(user);
	}
	
	//http://localhost:8080/addUserGetInfo
	@PostMapping("/addUserGetInfo")
	public ResponseEntity<String> createUserGetInfo(@RequestBody User user) {
		User savedUser = userDao.add(user);
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedUser.getId()).toUri();
		
		return ResponseEntity.created(location).body("User Created");
		
	}
	
	//http://localhost:8080/deleteUser/1
	@DeleteMapping("/deleteUser/{userId}")
	public void deleteUser(@PathVariable int userId) {
		User user = userDao.deleteUser(userId);
		
	}
	
	

}
