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


public Task save(Task task) {
    return taskRepository.save(task);
  }


  public Task getTaskById(Long id) {
    return taskRepository.findById(id)
            .orElseThrow(() -> new IllegalArgumentException("Task not found with id: " + id));
}

public void updateTask(Task task) {
    Task existingTask = taskRepository.findById(task.getTaskid())
            .orElseThrow(() -> new IllegalArgumentException("Task not found with id: " + task.getTaskid()));

    existingTask.setTaskname(task.getTaskname());
    existingTask.setProcess(task.getProcess());

    taskRepository.save(existingTask);
}

public void deleteTaskById(Long id) {
    taskRepository.deleteById(id);
}
}