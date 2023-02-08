package com.prototype.demo.service;

import com.prototype.demo.model.Gemba;
import com.prototype.demo.dao.GembaRepo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GembaService {



@Autowired
private GembaRepo gembaRepository;
private List<Gemba> gembas = new ArrayList<>();

public void saveGemba(Gemba gemba) {
  gembas.add(gemba);
}

public GembaRepo getGembaRepository() {
    return gembaRepository;
}

public void setGembaRepository(GembaRepo gembaRepository) {
    this.gembaRepository = gembaRepository;
}

public List<Gemba> getGembas() {
    return gembas;
}

public void setGembas(List<Gemba> gembas) {
    this.gembas = gembas;
}

public List<Gemba> getAllGembas() {
  return gembas;
}

public Gemba getGembaById(int id) {
  for (Gemba gemba : gembas) {
    if (gemba.getGembaID() == id) {
      return gemba;
    }
  }
  return null;
}
}