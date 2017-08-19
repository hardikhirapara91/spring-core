package com.hardik.springcore.domain;

import org.springframework.stereotype.Component;

/**
 * Toyota Car Class
 * 
 * @author HARDIK HIRAPARA
 *
 */
@Component("toyota")
public class Toyota implements Car {

	@Override
	public void getName() {
		System.out.println("This is Toyota Car.");
	}

}
