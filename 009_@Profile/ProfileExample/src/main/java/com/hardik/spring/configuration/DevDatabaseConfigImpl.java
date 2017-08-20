package com.hardik.spring.configuration;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * Developement Database Configuration Implementation
 * 
 * @author HARDIK HIRAPARA
 *
 */
@Profile("Developement")
@Configuration
public class DevDatabaseConfigImpl implements DatabaseConfig {

	/**
	 * Create Data Source
	 */
	@Override
	@Bean
	public DataSource createDataSource() {
		System.out.println("Creating DEV DataSourse.");

		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		/*
		 * Set MySQL specific properties for Development Environment
		 */

		return dataSource;
	}

}
