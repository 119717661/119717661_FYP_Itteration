package com.prototype.demo.util;

import java.io.IOException;
import java.io.Writer;
import java.util.List;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.springframework.stereotype.Component;

import com.prototype.demo.model.Employee;


@Component
public class CsvFileGenerator {
public void writeStudentsToCsv(List<Employee> employees, Writer writer) {
try {

CSVPrinter printer = new CSVPrinter(writer, CSVFormat.DEFAULT);
for (Employee employee : employees) {
printer.printRecord(employee.geteID(), employee.getEfName(), employee.getElName(),
employee.geteType());
}
} catch (IOException e) {
e.printStackTrace();
}
}
}
