package com.demo.version.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.version.Name;
import com.demo.version.PersonV1;
import com.demo.version.PersonV2;

/**
 * Same URI with version implementation using producer - It is producer
 * Versioning
 * 
 * @author PG
 *
 */
@RestController
public class VersionController_Producer {

	// http://localhost:8080/person/usingProducer
	// Add header value as "accept"="application/vnd.company.app-v1+json"
	@GetMapping(value = "person/usingProducer", produces = "application/vnd.company.app-v1+json")
	public PersonV1 getPersonV1() {
		return new PersonV1("Suresh Ravikumar");
	}

	// http://localhost:8080/person/usingProducer
	// Add header value as "accept"="application/suresh+json"
	@GetMapping(value = "person/usingProducer", produces = "application/suresh+json")
	public PersonV2 getPersonV2() {
		return new PersonV2(new Name("Suresh", "Ravikumar"));
	}

}
