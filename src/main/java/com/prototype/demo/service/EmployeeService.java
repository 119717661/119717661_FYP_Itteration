package 
com.prototype.demo.service;

import com.prototype.demo.dao.EmployeeRepo;
import com.prototype.demo.model.Employee;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
  public Employee getEmployeeById(Long procID) {
    return employeeRepository.findById(procID).orElse(null);
}

public void deleteById(long id) {
    employeeRepository.deleteById(id);
}


}