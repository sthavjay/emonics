package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@SpringBootApplication
public class FirstSpringApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Employee.class, args);
			
	     Employee e1=(Employee) context.getBean(Employee.class);
//	     Employee e2=(Employee) context.getBean("emp");
//	     Manager m1=(Manager) context.getBean("mgr");
	     e1.setId(1);
	     e1.setFirstName("Bijaya");
	     System.out.println(e1);
	}

}