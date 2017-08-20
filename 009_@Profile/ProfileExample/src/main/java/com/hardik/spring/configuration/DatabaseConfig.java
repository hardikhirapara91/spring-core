package com.hardik.spring.configuration;

import javax.sql.DataSource;

/**
 * Database Configuration Interface
 * 
 * @author HARDIK HIRAPARA
 *
 */
public interface DatabaseConfig {
	DataSource createDataSource();
}
