package com.prototype.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.prototype.demo.model.Employee;

public interface EmployeeRepo extends CrudRepository<Employee,Integer>
{

}
