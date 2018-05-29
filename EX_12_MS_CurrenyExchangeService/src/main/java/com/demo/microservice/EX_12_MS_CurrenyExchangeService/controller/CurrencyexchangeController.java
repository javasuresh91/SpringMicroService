package com.demo.microservice.EX_12_MS_CurrenyExchangeService.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.demo.microservice.EX_12_MS_CurrenyExchangeService.bean.ExchangeValue;
import com.demo.microservice.EX_12_MS_CurrenyExchangeService.bean.ExchangeValueEntity;
import com.demo.microservice.EX_12_MS_CurrenyExchangeService.repo.ExchangeValueRepository;

@RestController
public class CurrencyexchangeController {

	@Autowired
	private Environment env;

	
	@Autowired
	private ExchangeValueRepository exchangeValueRepository;
	
	//http://localhost:8000/curr-exchange/from/USD/to/INR
	/**
	 * Static Response
	 * @param from
	 * @param to
	 * @return
	 */
	@GetMapping("/curr-exchange/from/{from}/to/{to}")
	public ExchangeValue retriveExchangeValue(@PathVariable String from, @PathVariable String to) {
		ExchangeValue value = new ExchangeValue(1L, from, to, BigDecimal.valueOf(65));
		/**
		 * TO CREATE tWO INSTANCE 
		 * Select the Project.
		 * Open the Run Configuration
		 * enter the VM Arguments as "-Dserver.port=8001" 
		 * Then Apply and run
		 * Now the two instnace will run using 8000 and 8001 of the same service(EX_12_MS_CurrenyExchangeService)
		 * http://localhost:8001/curr-exchange/from/USD/to/INR
		 */
		value.setPort(Integer.parseInt(env.getProperty("local.server.port"))); // It will give the port of the instance running
		return value;
	}
	
	/**
	 * Dynamic(Database) Response
	 * @param from
	 * @param to
	 * @return
	 * http://localhost:8000/curr-exchange-two/from/USD/to/INR
	 */
	@GetMapping("/curr-exchange-two/from/{from}/to/{to}")
	public ExchangeValueEntity retriveExchangeValueTwo(@PathVariable String from, @PathVariable String to) {
		ExchangeValueEntity value = exchangeValueRepository.findByFromAndTo(from, to);
		
		value.setPort(Integer.parseInt(env.getProperty("local.server.port"))); // It will give the port of the instance running
		return value;
	}
	
	
	
}
