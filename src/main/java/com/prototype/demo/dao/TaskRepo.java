package com.prototype.demo.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prototype.demo.model.Task;

public interface TaskRepo extends JpaRepository<Task, Long> {
  
    List<Task> findByProcessProcID(Long procID);

}
