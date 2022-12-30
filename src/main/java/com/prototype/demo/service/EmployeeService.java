package 
com.prototype.demo.service;

import com.prototype.demo.dao.EmployeeRepo;
import com.prototype.demo.model.Employee;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

  private final EmployeeRepo employeeRepository;

  public EmployeeService(EmployeeRepo employeeRepository) {
    this.employeeRepository = employeeRepository;
  }

  public List<Employee> findAll() {
    return employeeRepository.findAll();
  }

  public Employee save(Employee employee) {
    return employeeRepository.save(employee);
  }
}