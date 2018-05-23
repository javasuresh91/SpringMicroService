package com.demo.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {
	
	/**
	 * Default Username : user
	 * Default Password : <Password Generated after the server starts/restarts>
	 * 
	 * OR
	 * 
	 * To Fix the User name and password static, Need to add the properties in the application.properties
	 */
	@GetMapping("/getAuthenExample")
	public String getName() {
		return "Suresh - Authendicated";
	}

}
