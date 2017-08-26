package com.hardik.spring.model;

import org.springframework.stereotype.Component;

/**
 * Message Class
 * 
 * @author HARDIK HIRAPARA
 *
 */
@Component("messageBean")
public class Message {

	public String getMessage() {
		return "Hello World!";
	}
}
