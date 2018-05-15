package com.spring.rest.filter.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class SomeBean {

	private String name;
	@JsonIgnore // This is used to igonre the property value from the response json in the result to User
	private String age;
	private String address;
	
	

	public SomeBean(String name, String age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public String getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(String age) {
		this.age = age;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

}
