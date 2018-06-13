package com.demo.microservice.EX_14_MS_Eurka_Naming_Server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/**
 * 
 * @author Sravikumar
 * The Naming Server is used to configure the load balance dynamically
 *
 */
@SpringBootApplication
/**
 * This is used to enable the Eurka server in the Application
 * @author Sravikumar
 *
 */
@EnableEurekaServer
public class Ex14MsEurkaNamingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ex14MsEurkaNamingServerApplication.class, args);
	}
}
