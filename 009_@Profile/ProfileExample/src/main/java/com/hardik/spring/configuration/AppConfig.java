package com.hardik.spring.configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Application Configuration
 * 
 * @author HARDIK HIRAPARA
 *
 */
@Configuration
@ComponentScan(basePackages = { "com.hardik.spring" })
public class AppConfig {

	@Autowired
	public DataSource dataSource;

}
