package com.hardik.springcore.domain;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

/**
 * Application
 * 
 * @author HARDIK HIRAPARA
 *
 */
@Component("employee")
public class Employee {

	@Resource(name = "address")
	private Address address;

	@Override
	public String toString() {
		return "Employee [" + address + "]";
	}
}
