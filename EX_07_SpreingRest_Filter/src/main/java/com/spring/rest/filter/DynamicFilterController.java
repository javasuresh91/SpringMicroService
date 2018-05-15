package com.spring.rest.filter;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.spring.rest.filter.bean.SomeBeanThree;

@RestController
// Dynamic Filtering :-
//
public class DynamicFilterController {

	// http://localhost:8080/dynaminFilter
	// Sending NAme and age
	@GetMapping("/dynaminFilter")
	public MappingJacksonValue retrieveBean() {

		SomeBeanThree someBean = new SomeBeanThree("Sure", "27", "XXXX", "yy");

		SimpleBeanPropertyFilter filterProperty = new SimpleBeanPropertyFilter.FilterExceptFilter(
				new HashSet<String>(Arrays.asList("name", "age")));
		FilterProvider filter = new SimpleFilterProvider().addFilter("filterId", filterProperty); // 'filterId' it should mention in the modal class
		MappingJacksonValue jackSon = new MappingJacksonValue(someBean);
		jackSon.setFilters(filter);

		return jackSon;
	}

	// http://localhost:8080/dynaminFilter-list
	// Sending Name and Address
	@GetMapping("/dynaminFilter-list")
	public MappingJacksonValue retrieveListBean() {
		List<SomeBeanThree> listBean = Arrays.asList(new SomeBeanThree("Sures", "27", "XXXX", "zz"),
				new SomeBeanThree("Suresh", "28", "XX", "aa"));
		SimpleBeanPropertyFilter filterProperty = new SimpleBeanPropertyFilter.FilterExceptFilter(
				new HashSet<String>(Arrays.asList("name", "address")));
		FilterProvider filterProvider = new SimpleFilterProvider().addFilter("filterId", filterProperty);
		MappingJacksonValue jackSon = new MappingJacksonValue(listBean);
		jackSon.setFilters(filterProvider);

		return jackSon;
	}
}
