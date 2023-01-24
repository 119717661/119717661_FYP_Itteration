package com.prototype.demo.controller;

import com.prototype.demo.model.Employee;
import com.prototype.demo.service.EmployeeService;
import com.prototype.demo.util.CsvFileGenerator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

@Controller
public class EmployeeController {

  private final EmployeeService employeeService;

  public EmployeeController(EmployeeService employeeService) {
    this.employeeService = employeeService;
  }

  @RequestMapping("/employee")
  public String home(Model model) {
    model.addAttribute("employees", employeeService.findAll());
    return "employee";
  }

  @RequestMapping("/showAllEmployees")
  public String showAllEmployees(Model model) {
    List<Employee> employees = employeeService.findAll();
    model.addAttribute("employees", employees);
    return "showAllEmployees";
  }

  @GetMapping("/addEmployee")
  public String addEmployeeForm(Model model) {
	  model.addAttribute("employee", new Employee());
	  return "addEmployee";
  }

  @PostMapping("/addEmployee")
  public String addEmployee(@ModelAttribute Employee employee, Model model) {
      employeeService.save(employee);
      model.addAttribute("employees", employeeService.findAll());
      return "showAllEmployees";
  }

  @GetMapping("/schedule")
  public String schedule(Model model) {
      List<Employee> employees = employeeService.findAll();
      model.addAttribute("employees", employees);
      return "schedule";
  }
  
  @Autowired
private CsvFileGenerator csvGenerator;

  @GetMapping("/export-to-csv")
  public void exportIntoCSV(HttpServletResponse response) throws IOException {
    response.setContentType("text/csv");
    response.addHeader("Content-Disposition", "attachment; filename=\"employee.csv\"");
    csvGenerator.writeEmployeesToCsv(employeeService.findAll(), response.getWriter());
  }

}
