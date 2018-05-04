package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootStarterApp {

	public static void main(String[] args) {
		ApplicationContext app = SpringApplication.run(SpringBootStarterApp.class, args);
		/*for(String name : app.getBeanDefinitionNames())
			System.out.println(name);*/

	}

}
