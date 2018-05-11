package com.spring.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rest.bean.HelloWorldBean;

@RestController
public class HelloWorldController {

	//http://localhost:8080/hello-world
	@RequestMapping(method=RequestMethod.GET,path="hello-world")
	public String sayHello() {
		return "Hai Everyone";
	}
	
	//http://localhost:8080/hello-world-bean
	@GetMapping("hello-world-bean")
	public HelloWorldBean sayHelloBean() {
		return new HelloWorldBean("Hiiii.... World");
	}
	
	//http://localhost:8080/hello-world/path-variable/Suresh
	@GetMapping(path="hello-world/path-variable/{name}") 
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
		return new HelloWorldBean("Hello...! "+name);
	}
	
	
	
	
	
}