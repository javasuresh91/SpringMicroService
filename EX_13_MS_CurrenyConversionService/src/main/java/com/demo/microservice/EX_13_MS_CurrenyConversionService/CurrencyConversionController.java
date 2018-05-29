package com.demo.microservice.EX_13_MS_CurrenyConversionService;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.demo.microservice.EX_13_MS_CurrenyConversionService.bean.ConvertionValue;

@RestController
public class CurrencyConversionController {

	@Autowired
	Environment env;

	/**
	 * http://localhost:8100/curr-convertor/from/USD/to/INR/quantity/1000 static
	 * response
	 * 
	 * @param from
	 * @param to
	 * @param qa
	 * @return
	 */
	@GetMapping("curr-convertor/from/{from}/to/{to}/quantity/{qa}")
	public ConvertionValue convertCurrency(@PathVariable String from, @PathVariable String to,
			@PathVariable BigDecimal qa) {

		return new ConvertionValue(1L, from, to, BigDecimal.ONE, qa, qa,
				Integer.parseInt(env.getProperty("local.server.port")));
	}

	/**
	 * http://localhost:8100/curr-convertor-two/from/USD/to/INR/quantity/1000
	 * 
	 * @param from
	 * @param to
	 * @param qa
	 * @return
	 */
	@GetMapping("curr-convertor-two/from/{from}/to/{to}/quantity/{qa}")
	public ConvertionValue convertCurrencyTwo(@PathVariable String from, @PathVariable String to,
			@PathVariable BigDecimal qa) {

		Map<String, String> uriParam = new HashMap<>();
		uriParam.put("from", from);
		uriParam.put("to", to);
		/**
		 * new RestTemplate().getForEntity() Is used to call the some other service from
		 * the current service
		 */
		ResponseEntity<ConvertionValue> responseEntity = new RestTemplate().getForEntity(
				"http://localhost:8000/curr-exchange-two/from/{from}/to/{to}", ConvertionValue.class, uriParam);

		/**
		 * getBody() is used to get the response from the above Service Call
		 */
		ConvertionValue response = responseEntity.getBody();
		System.out.println("Values From the Micro Serivce : " + response.toString());
		return new ConvertionValue(response.getId(), from, to, response.getConversionMultiple(), qa,
				qa.multiply(response.getConversionMultiple()), response.getPort());
	}

}
