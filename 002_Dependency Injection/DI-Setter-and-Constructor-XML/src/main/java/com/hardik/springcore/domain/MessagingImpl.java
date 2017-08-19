package com.hardik.springcore.domain;

/**
 * Messaging Implementation
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class MessagingImpl implements Messaging {

	@Override
	public void sendMessage() {
		System.out.println("Sending Message via Active MQ");
	}

}
