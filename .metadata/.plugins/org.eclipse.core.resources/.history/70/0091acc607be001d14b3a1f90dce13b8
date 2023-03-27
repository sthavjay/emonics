package emonics.hrm.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity @Table(name="DEPARTMENT")
@Setter @Getter @ToString
public class Department {
	@Id @Column(name="DEPT_ID")
	private int	id;
	@Column(name="DEPT_NAME")
	private String name;
//	@OneToMany(mappedBy="dept", fetch=FetchType.EAGER)
//	private List<Employee> emplist;
	
}
