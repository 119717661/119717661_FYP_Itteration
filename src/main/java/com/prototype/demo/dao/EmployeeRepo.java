package com.prototype.demo.dao;




import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.prototype.demo.model.Employee;

@Repository
public interface EmployeeRepo extends CrudRepository<Employee,Integer>
{


    

}
