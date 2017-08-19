package com.hardik.springcore.bean;

import com.hardik.springcore.domain.Messaging;

/**
 * Communication Bean
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class Communication {

	private Messaging messaging;

	/**
	 * DI via Setter
	 */
	public void setMessaging(Messaging messaging) {
		this.messaging = messaging;
	}

	public void commnunicate() {
		messaging.sendMessage();
	}
}
