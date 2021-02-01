package com.andrea.api.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andrea.api.model.Employee;
import com.andrea.api.repository.EmployeeRepository;

import lombok.Data;

@Data
@Service // pareil que @Component
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Optional<Employee> getEmployee(final Long id){
		return employeeRepository.findById(id);
	}
	
	public Iterable<Employee> getEpmloyees(){
		return employeeRepository.findAll();
	}
	
	public void deleteEmployee(final Long id) {
		employeeRepository.deleteById(id);
	}
	
	public Employee saveEmployee(Employee employee) {
		Employee savedEmployee = employeeRepository.save(employee);
		return savedEmployee;
				
	}
}
