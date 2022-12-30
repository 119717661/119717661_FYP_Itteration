package com.prototype.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.prototype.demo.model.Process;

public interface ProcessRepo extends JpaRepository<Process,Long> {
    
}
