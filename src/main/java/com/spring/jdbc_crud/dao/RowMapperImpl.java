package com.spring.jdbc_crud.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc_crud.entities.Customer;

public class RowMapperImpl implements RowMapper<Customer>{

	@Override
	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Customer customer = new Customer();
		customer.setId(rs.getInt(1));
		customer.setName(rs.getString(2));
		customer.setCity(rs.getString(3));
		customer.setContact(rs.getInt(4));
		customer.setEmail(rs.getString(5));
		
		return customer;
	}
	
}
