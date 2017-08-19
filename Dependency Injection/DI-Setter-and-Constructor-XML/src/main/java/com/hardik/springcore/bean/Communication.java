package com.hardik.springcore.bean;

import com.hardik.springcore.domain.Encryption;
import com.hardik.springcore.domain.Messaging;

/**
 * Communication Bean
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class Communication {

	private Messaging messaging;
	private Encryption encryption;

	/**
	 * DI via Constructor Injection
	 */
	public Communication(Messaging messaging) {
		this.messaging = messaging;
	}

	/**
	 * DI via Setter Injection
	 */
	public void setEncryption(Encryption encryption) {
		this.encryption = encryption;
	}

	public void encrypt() {
		encryption.setEncryption();
	}

	public void commnunicate() {
		messaging.sendMessage();
	}
}
