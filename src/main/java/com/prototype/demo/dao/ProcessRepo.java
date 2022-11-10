package com.prototype.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.prototype.demo.model.Process;

public interface ProcessRepo extends CrudRepository<Process,Integer> {
    
}
