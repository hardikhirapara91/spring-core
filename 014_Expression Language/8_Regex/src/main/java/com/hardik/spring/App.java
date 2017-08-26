package com.hardik.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring SPEL Ternary Operator Example.
 *
 * author HARDIK HIRAPARA
 */
public class App {
	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("app-config.xml");

		// Get regexTestBean.
		RegexTest regexTest = (RegexTest) context.getBean("regexTest");

		// Test data.
		System.out.println("Is valid: " + regexTest.isValidDigit());

		context.close();
	}

}
