package com.spring.jdbc_crud.entities;

public class Customer {
	
	private int id;
	private String name;
	private String city;
	private int contact;
	private String email;
	
	public Customer() {
		super();

	}

	public Customer(int id, String name, String city, int contact, String email) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.contact = contact;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getContact() {
		return contact;
	}

	public void setContact(int contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", city=" + city + ", contact=" + contact + ", email=" + email
				+ "]";
	}
	
	
}
