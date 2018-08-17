package com.demo.bootDemo.configuration;

import java.sql.DriverManager;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class config 
{
	@Autowired
	public DataSource dataSource;
	
	public JdbcTemplate getJdbcTemplate()
	{
		JdbcTemplate template=new JdbcTemplate();
		template.setDataSource(dataSource);
		return template;
	}
	
	@Bean
	public DriverManagerDataSource getDataSource()
	{
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setUsername("oracle");
		dataSource.setPassword("oracle");
		dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		return dataSource;
	}

}

