//BIBLIOGRAPHY and ACCREDITING:
/*W3school resources:
(no date) Bootstrap 3 tutorial. Available at: https://www.w3schools.com/bootstrap/ (Accessed: November 10, 2022). 
Spring tutorial (2022) W3schools. Available at: https://www.w3schools.blog/spring-tutorial (Accessed: November 10, 2022). 

Spring resources:
Spring makes java simple. (no date) Spring. Available at: https://spring.io/ (Accessed: November 10, 2022). 

Bootstrap resources:
Official CDN of bootstrap and font awesome (no date) Official CDN of Bootstrap and Font Awesome ·. Available at: https://www.bootstrapcdn.com/ (Accessed: November 10, 2022).

Ajax – jQuery Open-Source library:
Hosted libraries  |  google developers (no date) Google. Google. Available at: https://developers.google.com/speed/libraries/ (Accessed: November 10, 2022). 

H2-Database resources:
(no date) H2 database engine. Available at: https://www.h2database.com/html/main.html (Accessed: November 10, 2022). 

Educational Materials – Spring:
Telusko (no date) YouTube. YouTube. Available at: https://www.youtube.com/c/Telusko (Accessed: November 10, 2022). 
 */
package com.prototype.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.prototype.demo.model.Employee;
import com.prototype.demo.service.EmployeeService;

@SpringBootApplication
public class BootjpaApplication implements CommandLineRunner {

	@Autowired
	private EmployeeService employeeService;
	public static void main(String[] args) {
		SpringApplication.run(BootjpaApplication.class, args);
	}

	@Override
	public void run(String...a) {
	  for (int i = 0; i <= 10; i++) {
		Employee employee = new Employee();
		employee.setEfName("First Name");
		employee.setElName("Last Name");
		employee.seteType("Employee Type");
		employeeService.save(employee);
	  }
	}
}