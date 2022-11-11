package com.prototype.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Schedule {
    @Id
    private int scheduleID;
    private String week;
    
    public int getScheduleID() {
        return scheduleID;
    }
    public void setScheduleID(int scheduleID) {
        this.scheduleID = scheduleID;
    }
    public String getWeek() {
        return week;
    }
    public void setWeek(String week) {
        this.week = week;
    }


}
