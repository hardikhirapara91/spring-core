package com.hardik.springcore;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hardik.springcore.bean.Communication;

/**
 * Spring Core Dependency Injection using Setter Method
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class App {
	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("resources/spring-bean-config.xml");
		Communication communication = (Communication) context.getBean("communication");
		communication.commnunicate();
		communication.encrypt();
	}
}
