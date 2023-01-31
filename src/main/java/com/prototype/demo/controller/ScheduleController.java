package com.prototype.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.prototype.demo.dao.EmployeeRepo;
import com.prototype.demo.dao.ScheduleRepo;
import com.prototype.demo.dao.WeekRepo;
import com.prototype.demo.model.Employee;
import com.prototype.demo.model.Schedule;
import com.prototype.demo.model.Week;
import com.prototype.demo.service.WeekService;

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
    
    @RequestMapping("/schedule")
    public String home(Model model) {
        model.addAttribute("schedule");
        return "schedule";
    }
    
    @PostMapping("/save-schedule")
    public String saveSchedule(@RequestParam("weekNumber") String weekNumber,
    @RequestParam("MondayEmployee") String MondayEmployeeId,
    @RequestParam("TuesdayEmployee") String TuesdayEmployeeId,
    @RequestParam("WednesdayEmployee") String WednesdayEmployeeId,
    @RequestParam("ThursdayEmployee") String ThursdayEmployeeId,
    @RequestParam("FridayEmployee") String FridayEmployeeId) {
    Week week = new Week();
    week.setWeekNumber(weekNumber);
    weekRepository.save(week);
        
    Employee MondayEmployee = employeeRepository.findById(Long.valueOf(MondayEmployeeId)).orElse(null);
    Schedule schedule = new Schedule();
    schedule.setDay("Monday");
    schedule.setEmployee(MondayEmployee);
    schedule.setWeek(week);
    scheduleRepository.save(schedule);
    
    Employee TuesdayEmployee = employeeRepository.findById(Long.valueOf(TuesdayEmployeeId)).orElse(null);
    schedule = new Schedule();
    schedule.setDay("Tuesday");
    schedule.setEmployee(TuesdayEmployee);
    schedule.setWeek(week);
    scheduleRepository.save(schedule);
    
    Employee WednesdayEmployee = employeeRepository.findById(Long.valueOf(WednesdayEmployeeId)).orElse(null);
    schedule = new Schedule();
    schedule.setDay("Wednesday");
    schedule.setEmployee(WednesdayEmployee);
    schedule.setWeek(week);
    scheduleRepository.save(schedule);
    
    Employee ThursdayEmployee = employeeRepository.findById(Long.valueOf(ThursdayEmployeeId)).orElse(null);
    schedule = new Schedule();
    schedule.setDay("Thursday");
    schedule.setEmployee(ThursdayEmployee);
    schedule.setWeek(week);
    scheduleRepository.save(schedule);
    
    Employee FridayEmployee = employeeRepository.findById(Long.valueOf(FridayEmployeeId)).orElse(null);
    schedule = new Schedule();
    schedule.setDay("Friday");
    schedule.setEmployee(FridayEmployee);
    schedule.setWeek(week);
    scheduleRepository.save(schedule);
    
    return "redirect:/view-schedule";
    }
    


    @RequestMapping("/view-schedule")
    public String viewSchedule(Model model) {
        model.addAttribute("scheduleList", scheduleRepository.findAll());
        List<Week> weeks = weekService.findAll();
        model.addAttribute("weeks", weeks);
        return "view-schedule";
    }
}