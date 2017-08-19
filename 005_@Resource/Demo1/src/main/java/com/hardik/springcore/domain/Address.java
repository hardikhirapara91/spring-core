package com.hardik.springcore.domain;

import org.springframework.stereotype.Component;

/**
 * Application User
 * 
 * @author HARDIK HIRAPARA
 *
 */
@Component("address")
public class Address {

	private String Street = "ABC Street";
	private String city = "Mumbai";

	public String getStreet() {
		return Street;
	}

	public void setStreet(String street) {
		Street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [street=" + getStreet() + ", city=" + getCity() + "]";
	}
}
