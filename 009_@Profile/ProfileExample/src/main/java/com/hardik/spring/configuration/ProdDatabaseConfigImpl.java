package com.hardik.spring.configuration;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * Production Database Configuration Implementation
 * 
 * @author HARDIK HIRAPARA
 *
 */
@Profile("Production")
@Configuration
public class ProdDatabaseConfigImpl implements DatabaseConfig {

	/**
	 * Create Data Source
	 */
	@Override
	@Bean
	public DataSource createDataSource() {
		System.out.println("Creating PROD DataSource.");

		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		/*
		 * Set ORACLE specific properties for Production environment
		 */

		return dataSource;
	}

}
