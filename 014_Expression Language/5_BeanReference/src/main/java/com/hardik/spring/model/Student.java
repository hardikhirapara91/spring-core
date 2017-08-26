package com.hardik.spring.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Student
 * 
 * @author HARDIK HIRAPARA
 *
 */
@Component("studentBean")
public class Student {

	@Value("HARDIK HIRAPARA")
	private String name;
	@Value("#{addressBean.street}")
	private String street;
	@Value("#{addressBean.city}")
	private String city;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [name=" + getName() + ", street=" + getStreet() + ", city=" + getCity() + "]";
	}
}
