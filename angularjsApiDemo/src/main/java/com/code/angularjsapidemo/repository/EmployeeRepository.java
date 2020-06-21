package com.code.angularjsapidemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.code.angularjsapidemo.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

	Employee findByName(String name);
	
}
