package com.hardik.springcore.domain;

/**
 * Application
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class Employee {

	private Address address;

	public Employee(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [" + address + "]";
	}
}
