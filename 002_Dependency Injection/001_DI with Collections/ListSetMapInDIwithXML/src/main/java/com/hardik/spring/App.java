package com.hardik.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hardik.spring.model.Test;

/**
 * Application Main Class
 *
 */
public class App {
	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("app-config.xml");
		Test test = (Test) context.getBean("test");

		System.out.println("ID: " + test.getList());
		System.out.println("Name: " + test.getSet());
		System.out.println("STD: " + test.getMap());

	}

}
