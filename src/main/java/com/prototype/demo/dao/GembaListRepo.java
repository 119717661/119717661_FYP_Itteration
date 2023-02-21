package com.prototype.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prototype.demo.model.GembaList;

public interface GembaListRepo extends JpaRepository<GembaList, Long> {

}