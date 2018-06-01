package com.demo.microservice.EX_13_MS_CurrenyConversionService;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.demo.microservice.EX_13_MS_CurrenyConversionService.bean.ConvertionValue;

/**
 * This is used to make the feign to talk to the external micro service
 * 
 * @author PG
 *
 */
@FeignClient(name = "currency-exchange-service") // Should remove the url for load balacing(Ribbon)
/**
 * This will enable the Ribbon, we should enter in the proxy interface
 * 
 * @author PG
 *
 */
@RibbonClient(name = "currency-exchange-service")
public interface CurrenecyExchangeServiceProxyRibbon {

	/**
	 * This URI is used to call the external micro servic URI from
	 * EX_12_MS_CurrenyExchangeService
	 * 
	 * @param from
	 * @param to
	 * @return
	 */
	@GetMapping("/curr-exchange-two/from/{from}/to/{to}")
	public ConvertionValue retriveExchangeValueTwo(@PathVariable("from") String from, @PathVariable("to") String to);

}
