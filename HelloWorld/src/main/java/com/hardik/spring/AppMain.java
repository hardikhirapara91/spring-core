package com.hardik.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {

	public static void main(String[] args) {
		// AbstractApplicationContext context = new
		// AnnotationConfigApplicationContext(HelloWorldConfig.class);
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("resources/helloworld-config.xml");
		HelloWorld bean = (HelloWorld) context.getBean("helloWorldBean");
		bean.sayHello();
	}

}
