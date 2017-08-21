package com.hardik.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.hardik.spring.scheduling.MyBean;

@Configuration
@EnableScheduling
public class AppConfig {

	@Bean
	public MyBean getMyBean() {
		return new MyBean();
	}
}
