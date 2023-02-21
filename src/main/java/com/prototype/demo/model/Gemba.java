package com.prototype.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Gemba {
    @Id
    @Column(name="gembaID", nullable=false, unique=true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long gembaID;
    
    private String taskID;
    private String taskname;
    private String processName;
    private String timeOfTask;
   
    private String date;

    @ManyToOne
    @JoinColumn(name = "gembaListid")
    public GembaList gembaList;

    public long getGembaID() {
        return gembaID;
    }

    public void setGembaID(long gembaID) {
        this.gembaID = gembaID;
    }

    public String getTaskID() {
        return taskID;
    }

    public void setTaskID(String taskID) {
        this.taskID = taskID;
    }

    public String getTaskname() {
        return taskname;
    }

    public void setTaskname(String taskname) {
        this.taskname = taskname;
    }

    public String getProcessName() {
        return processName;
    }

    public void setProcessName(String processName) {
        this.processName = processName;
    }

    public String getTimeOfTask() {
        return timeOfTask;
    }

    public void setTimeOfTask(String timeOfTask) {
        this.timeOfTask = timeOfTask;
    }

   
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public GembaList getGembaList() {
        return gembaList;
    }

    public void setGembaList(GembaList gembaList) {
        this.gembaList = gembaList;
    }

}