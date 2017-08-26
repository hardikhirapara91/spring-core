package com.hardik.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hardik.spring.model.TwoWheeler;

/**
 * Application Main Class
 *
 */
public class App {
	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("app-config.xml");
		TwoWheeler twoWheeler = (TwoWheeler) context.getBean("twoWheeler");

		System.out.println("Type: " + twoWheeler.getType());
		System.out.println("Name:" + twoWheeler.getName());
	}

}
