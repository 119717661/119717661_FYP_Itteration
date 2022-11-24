package com.prototype.demo.dao;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import java.util.List;
import com.prototype.demo.model.Employee;

public interface EmployeeRepo extends CrudRepository<Employee,Integer>
{

    List<Employee> findByeType(String eType);

    List<Employee>findByeIDGreaterThan(int eID);
    @Query("from Employee where eType=?1 order by elName")
    List<Employee>findByeTypeSorted(String eType);
}
