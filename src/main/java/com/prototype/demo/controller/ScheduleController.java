package com.prototype.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.prototype.demo.dao.ScheduleRepo;
import com.prototype.demo.model.Schedule;

@Controller
public class ScheduleController {

	@Autowired
    private ScheduleRepo scheduleRepository;
    

    @RequestMapping("/schedule")
	public String home(Model model) {
	  model.addAttribute("schedule");
	  return "schedule";
	}

	@PostMapping("/save-schedule")
    public String saveSchedule(@RequestBody String[][] data) {
        for (int i = 0; i < data.length; i++) {
            Schedule schedule = new Schedule();
            schedule.setDay(data[i][0]);
            schedule.setEmployee(data[i][1]);
            scheduleRepository.save(schedule);
        }
        return "redirect:/schedule";
    }

}
