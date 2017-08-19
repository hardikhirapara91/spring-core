package com.hardik.springcore.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Application
 * 
 * @author HARDIK HIRAPARA
 *
 */
@Component("employee")
public class Employee {

	@Autowired
	private Address address;

	@Override
	public String toString() {
		return "Employee [" + address + "]";
	}
}
