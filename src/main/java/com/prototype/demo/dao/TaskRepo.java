package com.prototype.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.prototype.demo.model.Task;

public interface TaskRepo extends CrudRepository<Task,Integer>{
    
}
