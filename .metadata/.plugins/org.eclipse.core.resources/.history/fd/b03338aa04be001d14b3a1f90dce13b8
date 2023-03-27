package emonics.hrm.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.Getter;
import lombok.Setter;

@Entity @Table(name="insurance")
@Setter @Getter
public class EmployeeInsurance {
	@Id @Column(name="EMP_ID")
	private int id;
	@Column(name="doj")
	//@Temporal(TemporalType.DATE)
	private LocalDate dateOfJoining;
	@Column(name="ins_type")
	private String insType;

}
