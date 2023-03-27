package com.example.pojos;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	private int id;
	private String name;
	private double salary;
	@Autowired
	private Address address;
	
	public void init() {
		this.id=11;
		this.name="Xinyi";
		this.salary=2310.00;
	}
	
	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address + "]";
	}
	
	
	

}
