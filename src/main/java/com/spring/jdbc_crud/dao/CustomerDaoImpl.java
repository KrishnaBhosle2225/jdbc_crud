package com.spring.jdbc_crud.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc_crud.entities.Customer;

public class CustomerDaoImpl implements CustomerDao{

	JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	@Override
	public int insert(Customer customer) {
		
		String query = "insert into customer(id, name, city, contact, email) values (?,?,?,?,?)";
		
		int res = this.jdbcTemplate.update(query, customer.getId(), customer.getName(), customer.getCity(), customer.getContact(), customer.getEmail());
		
		return res;
	}
	
	@Override
	public int updateData(Customer customer) {
		
		String query = "update customer set name=?, email=?, city=?, contact=? where id=?";
		int op = this.jdbcTemplate.update(query, customer.getName(), customer.getEmail(), customer.getCity(), customer.getContact(), customer.getId());
		return op;
		
	}
	
	@Override
	public int deleteData(int id) {
		
		String query = "delete from customer where id=?";
		int update = this.jdbcTemplate.update(query, id);
		return update;
	}
	@Override
	public Customer select(int id) {
		
		RowMapper<Customer> rowMapper = new RowMapperImpl();
		String query = "select * from customer where id = ?";
		Customer customer = this.jdbcTemplate.queryForObject(query, rowMapper, id);
		return customer;
	}
	@Override
	public List<Customer> getAll() {
		
		String query = "select * from Customer";
		List<Customer> all = this.jdbcTemplate.query(query, new RowMapperImpl());
		return all;
	}
	
	
}
