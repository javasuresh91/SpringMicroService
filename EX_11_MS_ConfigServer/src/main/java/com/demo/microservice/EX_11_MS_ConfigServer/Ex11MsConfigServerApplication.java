package com.demo.microservice.EX_11_MS_ConfigServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class Ex11MsConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ex11MsConfigServerApplication.class, args);
	}
	//http://localhost:8888/limit-service/default
	//This is used to view the default property of the limit-service(limit-service.properties)
	//http://localhost:8888/limit-service/qa
	//This is used to view the QA environment property of the limit-service(limit-service-qa.properties)
	//http://localhost:8888/limit-service/deV
	//This is used to view the DEV environment property of the limit-service(limit-service-dev.properties)
	
	/**
	 * We can add N no environment to the single service
	 * Each file need to commit into the repo after the changes made.
	 */
}
