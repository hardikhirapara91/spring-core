package com.hardik.spring.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Student
 * 
 * @author HARDIK HIRAPARA
 *
 */
@Component("testBean")
public class Test {

	@Value("#{messageBean.message}")
	private String message;

	public void printMessage() {
		System.out.println(this.message);
	}
}
