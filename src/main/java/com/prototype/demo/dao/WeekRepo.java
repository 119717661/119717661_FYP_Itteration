package com.prototype.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prototype.demo.model.Week;

public interface WeekRepo extends JpaRepository<Week, Long>{    
}

  