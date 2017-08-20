package com.hardik.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.hardik.spring.configuration.AppConfig;
import com.hardik.spring.service.PropertyService;

/**
 * Application Main Class
 * 
 * author HARDIK HIRAPARA
 *
 */
public class App {
	public static void main(String[] args) {

		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		PropertyService propertyService = (PropertyService) context.getBean("propertyService");
		propertyService.getProperties();
		context.close();
	}
}
