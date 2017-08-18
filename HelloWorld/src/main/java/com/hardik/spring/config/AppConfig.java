package com.hardik.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;

import com.hardik.spring.HelloWorld;
import com.hardik.spring.HelloWorldImpl;

@Configuration
public class AppConfig {

	@Bean(name = "helloworldbean")
	@Description(value = "This is Hello World Bean")
	public HelloWorld helloWorldBean() {
		return new HelloWorldImpl();
	}
}
