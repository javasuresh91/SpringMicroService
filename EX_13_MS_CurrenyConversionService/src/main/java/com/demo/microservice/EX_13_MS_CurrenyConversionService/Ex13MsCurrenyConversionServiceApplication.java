package com.demo.microservice.EX_13_MS_CurrenyConversionService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * 
 * Need to enable the feign Client to talk to external micro service and pass the
 * package name for the scanning
 *
 */
@SpringBootApplication
@EnableFeignClients("com.demo.microservice.EX_13_MS_CurrenyConversionService")
public class Ex13MsCurrenyConversionServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(Ex13MsCurrenyConversionServiceApplication.class, args);
	}
}