package com.tcs.schoolDatabase.config;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.mariadb.jdbc.MariaDbDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class AppConfig {
	
	@Bean("databaseHelper")
	public DataSource getDataSource() throws SQLException {
		MariaDbDataSource obj = new MariaDbDataSource();
		
		obj.setUrl("jdbc:mariadb://localhost:3306/school");
		obj.setUser("root");
		obj.setPassword("root@123");
		
		return obj;
	}
	
	@Bean("template")
	public JdbcTemplate getTemplate() throws SQLException {
		return new JdbcTemplate(getDataSource());
	}
}
