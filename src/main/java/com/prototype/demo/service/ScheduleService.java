package com.prototype.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.prototype.demo.dao.ScheduleRepo;
import com.prototype.demo.model.Schedule;
@Service
public class ScheduleService {

    private final ScheduleRepo scheduleRepository;

public ScheduleService(ScheduleRepo scheduleRepository) {
    this.scheduleRepository = scheduleRepository;
}

public Schedule save(Schedule schedule) {
    return scheduleRepository.save(schedule);
}

public List<Schedule> findAll() {
    return scheduleRepository.findAll();
  }

}


