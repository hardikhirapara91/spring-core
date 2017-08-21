package com.hardik.spring.scheduling;

import org.springframework.scheduling.annotation.Scheduled;

/**
 * My Bean
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class MyBean {

	@Scheduled(fixedRate = 5000)
	public void printMessage() {
		System.out.println("I am called by MethodInvokingJobDetailFactoryBean using SimpleTriggerFactoryBean");
	}

}
