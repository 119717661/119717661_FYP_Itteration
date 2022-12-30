package com.prototype.demo.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.prototype.demo.model.Task;

public interface TaskRepo extends JpaRepository<Task, Long> {
  
}
