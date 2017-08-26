package com.hardik.spring.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Address
 * 
 * @author HARDIK HIRAPARA
 *
 */
@Component("addressBean")
public class Address {

	@Value("Meera Road")
	private String street;
	@Value("Mumbai")
	private String city;

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

}
