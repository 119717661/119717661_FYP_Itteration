package com.prototype.demo.service;

import com.prototype.demo.dao.ScheduleRepo;
import com.prototype.demo.model.Schedule;

public class ScheduleService {

    private final ScheduleRepo scheduleRepository;

public ScheduleService(ScheduleRepo scheduleRepository) {
    this.scheduleRepository = scheduleRepository;
}

public Schedule save(Schedule schedule) {
    return scheduleRepository.save(schedule);
}

    
}


