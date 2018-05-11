package com.spring.i18n;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@SpringBootApplication
public class SpringApp {

	public static void main(String[] args) {
		SpringApplication.run(SpringApp.class, args);
	}
	
	@Bean
	public LocaleResolver getLocale() {
		SessionLocaleResolver localResolve = new SessionLocaleResolver();
		localResolve.setDefaultLocale(Locale.US);
		return localResolve;
	}
	
	@Bean
	public ResourceBundleMessageSource messageSource() {
		ResourceBundleMessageSource message = new ResourceBundleMessageSource();
		message.setBasenames("messages");
		return message;
	}

}
