package com.spring.jdbc_crud;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.jdbc_crud.dao.CustomerDao;
import com.spring.jdbc_crud.dao.CustomerDaoImpl;



//########################## THIS IS A JAVA CONFIGURATION FILE WE CAN USE INSTEAD OF CONFIG.XML 

@Configuration
public class JdbcConfig {
	
	@Bean("ds")
	public DataSource getDataSource() {
		
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("");
		return ds;
	}
	
	@Bean("jdbcTemplate")
	public JdbcTemplate geJdbcTemplate() {
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
	}
	
	
	@Bean("customerDao")
	public CustomerDao getCustomerDao() {
		
		CustomerDaoImpl customerDao = new CustomerDaoImpl();
		customerDao.setJdbcTemplate(geJdbcTemplate());
		return customerDao;
	}
	
	
}
