package com.prototype.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prototype.demo.dao.TaskRepo;
import com.prototype.demo.model.Task;

@Service
public class TaskService {

@Autowired
private TaskRepo taskRepository;

public List<Task> getAllTasks() {
return taskRepository.findAll();
}

public List<Task> getTasksForProcess(Long procID) {
return taskRepository.findByProcessProcID(procID);
}


public Task save(Task task) {
    return taskRepository.save(task);
  }
}
