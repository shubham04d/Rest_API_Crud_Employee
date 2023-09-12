package com.rest.repositories;

import org.springframework.data.repository.CrudRepository;

import com.rest.models.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer>{

}
