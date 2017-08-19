package com.hardik.springcore.domain;

import org.springframework.stereotype.Component;

/**
 * Honda Car Class
 * 
 * @author silent
 *
 */
@Component("honda")
public class Honda implements Car {

	@Override
	public void getName() {
		System.out.println("This is Honda Car.");
	}

}
