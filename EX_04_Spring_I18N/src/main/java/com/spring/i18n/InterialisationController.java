package com.spring.i18n;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InterialisationController {

	@Autowired
	private MessageSource messageSource;

	//http://localhost:8080/i18n-wishes
	// Accept-Language = en/fr
	@GetMapping("/i18n-wishes")
	public String getWishes(@RequestHeader(name = "Accept-Language", required = false) Locale locale) {
		return messageSource.getMessage("good.morning.message", null, locale);
	}

}
