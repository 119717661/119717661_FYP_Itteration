package com.prototype.demo.service;

import com.prototype.demo.model.Gemba;
import com.prototype.demo.dao.GembaRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GembaService {



@Autowired
private GembaRepo gembaRepository;



public void saveGemba(Gemba gemba) {
  gembaRepository.save(gemba);
}

public GembaRepo getGembaRepository() {
    return gembaRepository;
}

public void setGembaRepository(GembaRepo gembaRepository) {
    this.gembaRepository = gembaRepository;
}


}
