package com.prototype.demo.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prototype.demo.dao.EmployeeRepo;
import com.prototype.demo.model.Employee;

@Service
public class EmployeeService{
 
    @Autowired
    public static EmployeeRepo repo;



    public List<Employee> getAllEmployees(){
        List<Employee> employees = new ArrayList<>();
        repo.findAll().forEach(employees::add);
        return employees;

    
}
}
