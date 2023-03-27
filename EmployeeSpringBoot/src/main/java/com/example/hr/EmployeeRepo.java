package com.example.hr;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.entities.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer>{
		public List<Employee> findByDeptId(int id);
		public List<Employee> findById(int id);
		
		
//		@Query(value="select e from Employee e where e.salary >:sal")
//		public List<Employee> listAll(@Param("sal") double salary);
	}
