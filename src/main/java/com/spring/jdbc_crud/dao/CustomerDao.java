package com.spring.jdbc_crud.dao;

import java.util.List;

import com.spring.jdbc_crud.entities.Customer;

public interface CustomerDao {
	
	public int insert(Customer customer);
	
	public int updateData(Customer customer);
	
	public int deleteData(int id);
	
	public Customer select(int id);
	
	public List<Customer> getAll();
}
