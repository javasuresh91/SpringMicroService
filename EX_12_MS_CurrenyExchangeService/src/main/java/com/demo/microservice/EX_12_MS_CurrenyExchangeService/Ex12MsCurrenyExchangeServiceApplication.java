package com.demo.microservice.EX_12_MS_CurrenyExchangeService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Ex12MsCurrenyExchangeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ex12MsCurrenyExchangeServiceApplication.class, args);
	}
}
