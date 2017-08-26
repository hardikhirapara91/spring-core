package com.hardik.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hardik.spring.model.Student;

/**
 * Application Main Class
 *
 */
public class App {
	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("app-config.xml");
		Student student = (Student) context.getBean("student");

		System.out.println("ID: " + student.getId());
		System.out.println("Name: " + student.getName());
		System.out.println("STD: " + student.getStd());

	}

}
