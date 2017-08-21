package com.hardik.spring.scheduling;

import org.springframework.stereotype.Component;

/**
 * My Bean
 * 
 * @author HARDIK HIRAPARA
 *
 */
@Component("myBean")
public class MyBean {

	public void printMessage() {
		System.out.println("I am called by Spring scheduler");
	}

}
