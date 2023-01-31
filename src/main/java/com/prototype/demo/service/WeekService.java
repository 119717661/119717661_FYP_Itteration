package com.prototype.demo.service;

import com.prototype.demo.model.Week;
import com.prototype.demo.dao.WeekRepo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeekService {
    @Autowired
    private final WeekRepo weekRepository;

    
    public WeekService(WeekRepo weekRepository) {
        this.weekRepository = weekRepository;
    }

    public List<Week> findAll() {
        return weekRepository.findAll();
      }

    public Week saveWeek(Week week) {
        return weekRepository.save(week);
    }
}
