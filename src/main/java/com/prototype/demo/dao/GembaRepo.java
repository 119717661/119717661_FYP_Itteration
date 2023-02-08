package com.prototype.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.prototype.demo.model.Gemba;

public interface GembaRepo extends JpaRepository<Gemba, Long>{
    @Query("SELECT max(g.gembaID) FROM Gemba g")
    Integer findMaxGembaID();
}
    

