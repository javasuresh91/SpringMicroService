package com.demo.microservice.EX_10_MS_LimitService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.microservice.EX_10_MS_LimitService.AppConfig;
import com.demo.microservice.EX_10_MS_LimitService.bean.LimitConfiguration;

@RestController
public class LimitConfigController {

	@Autowired
	AppConfig appProp;

	// http://localhost:8080/limits
	@GetMapping("/limits")
	public LimitConfiguration getLimitFromConfiguration() {

		return new LimitConfiguration(1000, 1); // Hard Coded Values

	}

	// http://localhost:8080/limits-two
	@GetMapping("/limits-two")
	public LimitConfiguration getLimitFromConfigurationTwo() {
		/**
		 * Values read from the property file, if u remove 'spring.cloud.config.uri'
		 * Or, it read from the default profile from config server
		 */
		return new LimitConfiguration(appProp.getMaximum(), appProp.getMinimum());

	}
}
