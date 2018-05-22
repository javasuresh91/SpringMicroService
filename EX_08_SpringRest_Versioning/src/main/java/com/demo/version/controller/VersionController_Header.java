package com.demo.version.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.version.Name;
import com.demo.version.PersonV1;
import com.demo.version.PersonV2;

/**
 * Same URI with version implementation using headers - It is header Versioning
 * 
 * @author PG
 *
 */
@RestController
public class VersionController_Header {

	// http://localhost:8080/person/usingHeader
	// Add header value as "ver"="1"
	@GetMapping(value = "person/usingHeader", headers = "ver=1")
	public PersonV1 getPersonV1() {
		return new PersonV1("Suresh Ravikumar");
	}

	// http://localhost:8080/person/usingHeader
	// Add header value as "ver"="2"
	@GetMapping(value = "person/usingHeader", headers = "ver=2")
	public PersonV2 getPersonV2() {
		return new PersonV2(new Name("Suresh", "Ravikumar"));
	}

}
