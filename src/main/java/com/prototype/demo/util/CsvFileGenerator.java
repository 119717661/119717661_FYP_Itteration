package com.prototype.demo.util;

import java.io.IOException;
import java.io.Writer;
import java.util.List;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.springframework.stereotype.Component;

import com.prototype.demo.model.Employee;
import com.prototype.demo.model.Schedule;


@Component
public class CsvFileGenerator {

    //Employee Writer
public void writeEmployeesToCsv(List<Employee> employees, Writer writer) {
try {

try (CSVPrinter printer = new CSVPrinter(writer, CSVFormat.DEFAULT)) {
    for (Employee employee : employees) {
    printer.printRecord(employee.geteID(), employee.getEfName(), employee.getElName(),
    employee.geteType());
    }
}
} catch (IOException e) {
e.printStackTrace();
}
}


public void writeSheduleToCsv(List<Schedule> schedules, Writer writer) {
    try {
    
    try (CSVPrinter printer = new CSVPrinter(writer, CSVFormat.DEFAULT)) {
        for (Schedule schedule : schedules) {
        printer.printRecord(schedule.getId(), schedule.employee.getEfName(), schedule.employee.getElName(),
        schedule.week.getWeekNumber());
        }
    }
    } catch (IOException e) {
    e.printStackTrace();
    }
    }

}
