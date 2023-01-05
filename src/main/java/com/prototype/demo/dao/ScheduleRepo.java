package com.prototype.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prototype.demo.model.Schedule;

public interface ScheduleRepo extends JpaRepository<Schedule, Long> {
}