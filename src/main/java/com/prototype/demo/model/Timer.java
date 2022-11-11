package com.prototype.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Timer {
   @Id 
    private Double timestop;

    public Double getTimestop() {
        return timestop;
    }

    public void setTimestop(Double timestop) {
        this.timestop = timestop;
    }

}
