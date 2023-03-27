package com.example.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data @Entity @Table(name = "EMPLOYEE")
public class Employee {
		@Id @Column(name = "id")
		private int id;
		@Column (name = "firstname")
		private String firstName;
		@Column (name = "lastname")
		private String lastName;
		@Column (name = "salary")
		private float salary;
		
		@ManyToOne
		@JoinColumn(name = "dept_id", referencedColumnName = "dept_id")
		private Department dept;
		
		
		public Employee() {}


		public Employee(int id, String firstName, String lastName, float salary, Department d) {
			super();
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.salary = salary;
			this.dept = d;
		}
		
}
