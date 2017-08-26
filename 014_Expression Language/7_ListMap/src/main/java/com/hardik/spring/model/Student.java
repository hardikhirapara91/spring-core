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

	@Value("#{listMapTestBean.list[0]}")
	private String firstName;
	@Value("#{listMapTestBean.map[1]}")
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + getFirstName() + ", lastName=" + getLastName() + "]";
	}

}
