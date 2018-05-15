package com.spring.rest.filter;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rest.filter.bean.SomeBean;
import com.spring.rest.filter.bean.SomeBeanTwo;

@RestController
// Static Filering : - 
//Filtering the particular value is achieved by the @JsonIgnore in the modal
// class of the property
// or
//
public class StaticFilterController {

	// http://localhost:8080/staticFilter
	@GetMapping("/staticFilter")
	public SomeBean retrieveBean() {

		return new SomeBean("Sure", "27", "XXXX");
	}

	// http://localhost:8080/staticFilter-list
	@GetMapping("/staticFilter-list")
	public List<SomeBean> retrieveListBean() {

		return Arrays.asList(new SomeBean("Sures", "27", "XXXX"), new SomeBean("Suresh", "28", "XXXX"));
	}

	// http://localhost:8080/staticFilteTwo
	@GetMapping("/staticFilteTwo")
	public SomeBeanTwo retrieveBeanTwo() {

		return new SomeBeanTwo("Sure", "27", "XXXX");
	}

	// http://localhost:8080/staticFilteTwo-list
	@GetMapping("/staticFilteTwo-list")
	public List<SomeBeanTwo> retrieveListBeanTwo() {

		return Arrays.asList(new SomeBeanTwo("Sures", "27", "XXXX"), new SomeBeanTwo("Suresh", "28", "XXXX"));
	}
}
