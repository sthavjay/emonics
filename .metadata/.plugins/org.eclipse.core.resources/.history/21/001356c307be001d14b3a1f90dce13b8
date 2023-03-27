package emonics.hrm.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Data @Entity @Table(name="EMPLOYEE")
@NamedQueries(
		{
			@NamedQuery(name="employee.findall", query="select e from Employee e"),
			@NamedQuery(name="employee.findbyDept", query="select e from Employee e where e.dept.id=:did"),
		}
)

public class Employee implements Serializable {
	@Id @Column(name="EMP_ID")
	private int id; 
	@Column(name="EMP_NAME")
	private String name;
	@Column(name="SALARY")
	private double salary;
	@Column(name="MGR_ID")
	private Integer mgrId;
	
	@ManyToOne
	@JoinColumn(name="DEPT_ID", referencedColumnName="DEPT_ID")
	private Department dept;
	
	public Employee(int id, String name, double salary, int mgrId, Department d) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dept = d;
		this.mgrId = mgrId;
	}

	public Employee() {
		
	}
	
}
