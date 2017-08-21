package com.hardik.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.hardik.spring.config.AppConfig;

/**
 * Application Main Class
 *
 */
public class App {
	public static void main(String[] args) {

		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		context.close();
	}
}
