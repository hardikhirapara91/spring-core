package com.hardik.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.hardik.springcore.domain.Car;

/**
 * Bond Class
 * 
 * @author HARDIK HIRAPARA
 *
 */
@Component
public class Bond {

	@Autowired
	@Qualifier("honda")
	private Car car;

	public void getCarName() {
		car.getName();
	}
}
