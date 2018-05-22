package com.demo.version.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.version.Name;
import com.demo.version.PersonV1;
import com.demo.version.PersonV2;

@RestController
public class VersionController_URI {

	//localhost:8080/v1/person
	@GetMapping("/v1/person")
	public PersonV1 getPersonV1() {
		return new PersonV1("Suresh Ravikumar");
	}

	//http://localhost:8080/v2/person
	@GetMapping("/v2/person")
	public PersonV2 getPersonV2() {
		return new PersonV2(new Name("Suresh", "Ravikumar"));
	}

}
