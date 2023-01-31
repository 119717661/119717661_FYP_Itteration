package com.prototype.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.prototype.demo.model.Gemba;

@Service
public class GembaService {

    private List<Gemba> gembas = new ArrayList<>();

    public void saveGembaInformation(Gemba gemba) {
        gembas.add(gemba);
    }

    public List<Gemba> getAllGembaInformation() {
        return gembas;
    }
}
