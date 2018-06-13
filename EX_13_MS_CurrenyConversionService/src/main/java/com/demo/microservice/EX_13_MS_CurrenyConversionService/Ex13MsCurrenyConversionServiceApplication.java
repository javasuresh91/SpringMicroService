package com.demo.microservice.EX_13_MS_CurrenyConversionService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
/**
 * 
 * Need to enable the feign Client to talk to external micro service and pass the
 * package name for the scanning
 *
 */
@EnableFeignClients("com.demo.microservice.EX_13_MS_CurrenyConversionService")

/**
 * 
 * @author Sravikumar
 * This Currency conversion application needs to register with the Naming Server
 */
@EnableDiscoveryClient
public class Ex13MsCurrenyConversionServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(Ex13MsCurrenyConversionServiceApplication.class, args);
	}
}