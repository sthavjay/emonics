package emonics.hrm.web;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import emonics.hrm.dao.EmployeeInsuranceRepo;
import emonics.hrm.dao.EmployeeRepo;
import emonics.hrm.entities.Department;
import emonics.hrm.entities.Employee;
import emonics.hrm.entities.EmployeeInsurance;
import emonics.hrm.services.HrService;
import emonics.hrm.util.Message;

@RestController  @ResponseBody @RequestMapping("/hrm")
//@Controller @ResponseBody 
public class EmployeeRS {
	@Autowired
	private HrService serv;
	
	//@RequestMapping(method=RequestMethod.GET)
	@GetMapping("/find/{id}")
	public Employee get(@PathVariable int id) {
		return serv.findById(id);
	}
	
	
	@PostMapping("add") 
	public Message save(@RequestBody emonics.hrm.util.Employee e) {
		Employee emp=new Employee();
		emp.setId(e.getId());
		emp.setName(e.getName());
		emp.setSalary(e.getSalary());
		emp.setMgrId(e.getMgrId());
		Department d=serv.findDeptById(e.getDeptId());
		emp.setDept(d);
		EmployeeInsurance ein=new EmployeeInsurance();
		ein.setId(e.getId());
		ein.setDateOfJoining(LocalDate.parse(e.getDateOfJoining()));
		ein.setInsType(e.getInsType());
		return serv.save(emp, ein);
	}
}
