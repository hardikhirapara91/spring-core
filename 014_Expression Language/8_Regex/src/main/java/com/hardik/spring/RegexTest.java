package com.hardik.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Regular Expression Test Class
 * 
 * @author HARDIK HIRAPARA
 *
 */
@Component("regexTest")
public class RegexTest {

	@Value("#{'250' matches '\\d+'}")
	private boolean validDigit;

	public boolean isValidDigit() {
		return validDigit;
	}

	public void setValidDigit(boolean validDigit) {
		this.validDigit = validDigit;
	}

}
