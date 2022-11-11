package com.prototype.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Gemba {
    @Id
    private int gembaID;

    public int getGembaID() {
        return gembaID;
    }

    public void setGembaID(int gembaID) {
        this.gembaID = gembaID;
    }

}
