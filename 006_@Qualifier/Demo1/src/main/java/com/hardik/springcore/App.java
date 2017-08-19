package com.hardik.springcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * Spring Core Dependency Injection using Setter Method
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class App {
	public static void main(String[] args) {

		// AbstractApplicationContext context = new
		// ClassPathXmlApplicationContext("resources/spring-bean-config.xml");

		AbstractApplicationContext context = new AnnotationConfigApplicationContext(
				com.hardik.springcore.AppConfig.class);
		Bond bond = (Bond) context.getBean("bond");
		bond.getCarName();
	}
}
