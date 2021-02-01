package com.andrea.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.andrea.api.model.Employee;


@Repository // indique que la classe est un bean et donc communique av 1 source de données ( spécialisation de @Component, on peut utiliser @Component aussi)
public interface EmployeeRepository extends CrudRepository<Employee, Long>{

}
