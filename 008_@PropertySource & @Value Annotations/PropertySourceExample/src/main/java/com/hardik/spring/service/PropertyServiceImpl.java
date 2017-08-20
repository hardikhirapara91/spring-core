package com.hardik.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

/**
 * Property Service Implementation
 * 
 * @author HARDIK HIRAPARA
 *
 */
@Service("propertyService")
public class PropertyServiceImpl implements PropertyService {

	@Value("${sourceLocation:e:/temp/input}")
	private String source;

	@Value("${destinationLocation:e:/temp/output}")
	private String destination;

	@Autowired
	private Environment environment;

	/**
	 * Get Properties
	 */
	@Override
	public void getProperties() {
		System.out
				.println("Getting property via Spring Environment :" + environment.getProperty("jdbc.driverClassName"));

		System.out.println("Source Location : " + source);
		System.out.println("Destination Location : " + destination);
	}

}
