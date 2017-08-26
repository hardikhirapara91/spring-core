package com.hardik.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hardik.spring.model.Test;

/**
 * Spring SPEL Ternary Operator Example.
 *
 * author HARDIK HIRAPARA
 */
public class App {
	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("app-config.xml");

		Test test = (Test) context.getBean("testBean");
		test.printMessage();

		context.close();
	}

}
