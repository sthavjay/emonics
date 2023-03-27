package com.example.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import antlr.collections.List;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString @Entity @Table (name = "department")
public class Department {
	
	@Id @Column(name="Dept_id")
	private int id;
	@Column(name="Dept_name")
	private String name;
	
//	@OneToMany(mappedBy="dept", fetch=FetchType.EAGER)
//	private List<Employee> emplist;
	
}
