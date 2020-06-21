package com.code.angularjsapidemo.service;

import java.util.List;
import javax.persistence.EntityExistsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.code.angularjsapidemo.model.Employee;
import com.code.angularjsapidemo.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	private EmployeeRepository employeeRepository;
	
	@Autowired
	public EmployeeService(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	
	//create
	public Employee save(Employee employee) {
		if(employee.getId() != null && employeeRepository.exists(employee.getId())) {
			throw new EntityExistsException("There is alrady exsisting entity with such ID in the DB.");
		}
		return employeeRepository.save(employee);
	}
	
	//update
	public Employee update(Employee employee) {
		if(employee.getId() != null && employeeRepository.exists(employee.getId())) {
			throw new EntityExistsException("There is alrady existing entity with such ID in the DB.");
		}
		return employeeRepository.save(employee);
	}
	
	//findAll
	public List<Employee> findAll(){
		return employeeRepository.findAll();
	}
	
	//findOne
	public Employee findOne(Integer id){
		return employeeRepository.findOne(id);
	}
	
	//delete
	public void delete(Integer id) {
		employeeRepository.delete(id);
	}
	
}
