package com.prototype.demo.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.prototype.demo.dao.EmployeeRepo;
import com.prototype.demo.dao.ScheduleRepo;
import com.prototype.demo.dao.WeekRepo;
import com.prototype.demo.model.Employee;
import com.prototype.demo.model.Schedule;
import com.prototype.demo.model.Week;
import com.prototype.demo.service.ScheduleService;
import com.prototype.demo.service.WeekService;
import com.prototype.demo.util.CsvFileGenerator;

@Controller
public class ScheduleController {
    @Autowired
    private ScheduleRepo scheduleRepository;
    
    @Autowired
    private WeekRepo weekRepository;

    @Autowired
    private EmployeeRepo employeeRepository;

    @Autowired
    private WeekService weekService;

    @Autowired
    private ScheduleService scheduleService;
    
    @RequestMapping("/schedule")
    public String home(Model model) {
        model.addAttribute("schedule");
        return "schedule";
    }
    
    @PostMapping("/save-schedule")
    public String saveSchedule(@RequestParam("weekNumber") String weekNumber,
     ServletRequest request) {
        
    Week week = new Week();
    week.setWeekNumber(weekNumber);
    weekRepository.save(week);
    String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
    for (String day : days) {
        sheduleDay(week, day, request);
    }
      return "redirect:/view-schedule";
    }


    @RequestMapping("/view-schedule")
    public String viewSchedule(Model model) {
        model.addAttribute("scheduleList", scheduleRepository.findAll());
        List<Week> weeks = weekService.findAll();
        model.addAttribute("weeks", weeks);
        return "view-schedule";
    }

    public void sheduleDay( Week week, String day, ServletRequest req) {
        String employeeId = req.getParameter(day+"Employee");
        Employee employee = employeeRepository.findById(Long.valueOf(employeeId)).orElse(null);
        Schedule schedule = new Schedule();
        schedule = new Schedule();
        schedule.setDay(day);
        schedule.setEmployee(employee);
        schedule.setWeek(week);
        scheduleRepository.save(schedule);
    }

    @Autowired
    private CsvFileGenerator csvGenerator;
    
      @GetMapping("/shedule-to-csv")
      public void exportIntoCSV(HttpServletResponse response) throws IOException {
        response.setContentType("text/csv");
        response.addHeader("Content-Disposition", "attachment; filename=\"schedule.csv\"");
        csvGenerator.writeSheduleToCsv(scheduleService.findAll(), response.getWriter());
      }

}

    // @RequestParam("MondayEmployee") String MondayEmployeeId,
    // @RequestParam("TuesdayEmployee") String TuesdayEmployeeId,
    // @RequestParam("WednesdayEmployee") String WednesdayEmployeeId,
    // @RequestParam("ThursdayEmployee") String ThursdayEmployeeId,
    // @RequestParam("FridayEmployee") String FridayEmployeeId,

    
    // Employee MondayEmployee = employeeRepository.findById(Long.valueOf(MondayEmployeeId)).orElse(null);
    // Schedule schedule = new Schedule();
    // schedule.setDay("Monday");
    // schedule.setEmployee(MondayEmployee);
    // schedule.setWeek(week);
    // scheduleRepository.save(schedule);
    
    // Employee TuesdayEmployee = employeeRepository.findById(Long.valueOf(TuesdayEmployeeId)).orElse(null);
    // schedule = new Schedule();
    // schedule.setDay("Tuesday");
    // schedule.setEmployee(TuesdayEmployee);
    // schedule.setWeek(week);
    // scheduleRepository.save(schedule);
    
    // Employee WednesdayEmployee = employeeRepository.findById(Long.valueOf(WednesdayEmployeeId)).orElse(null);
    // schedule = new Schedule();
    // schedule.setDay("Wednesday");
    // schedule.setEmployee(WednesdayEmployee);
    // schedule.setWeek(week);
    // scheduleRepository.save(schedule);
    
    // Employee ThursdayEmployee = employeeRepository.findById(Long.valueOf(ThursdayEmployeeId)).orElse(null);
    // schedule = new Schedule();
    // schedule.setDay("Thursday");
    // schedule.setEmployee(ThursdayEmployee);
    // schedule.setWeek(week);
    // scheduleRepository.save(schedule);
    
    // Employee FridayEmployee = employeeRepository.findById(Long.valueOf(FridayEmployeeId)).orElse(null);
    // schedule = new Schedule();
    // schedule.setDay("Friday");
    // schedule.setEmployee(FridayEmployee);
    // schedule.setWeek(week);
    // scheduleRepository.save(schedule);