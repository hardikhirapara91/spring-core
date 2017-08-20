package com.hardik.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Application Main Class
 * 
 * author HARDIK HIRAPARA
 *
 */
public class App {
	public static void main(String[] args) {
		// AbstractApplicationContext context = new
		// ClassPathXmlApplicationContext("app-config.xml");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

		// Sets the active profiles
		context.getEnvironment().setActiveProfiles("Development");

		// Scans the mentioned package[s] and register all the @Component
		// available to Spring
		context.scan("com.hardik.spring");
		context.refresh();
		context.close();
	}
}
