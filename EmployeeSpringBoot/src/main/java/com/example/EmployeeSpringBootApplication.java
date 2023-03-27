package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.entities.Employee;
import com.example.hr.EmployeeRepo;

@SpringBootApplication
public class EmployeeSpringBootApplication { // implements CommandLineRunner{

	@Autowired
	//private EmployeeRepo repo;
	
	
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(EmployeeSpringBootApplication.class, args);
		EmployeeRepo e1 = (EmployeeRepo) ctx.getBean(Employee.class);
//		List <Employee> emplist = e1.findById(2);
		e1.findById(3);
		System.out.println(e1);
		
		
	}


//	@Override
//	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//		
//	}

}
