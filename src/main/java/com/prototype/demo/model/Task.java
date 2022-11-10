package com.prototype.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Task {
    @Id
    private int taskID;
    private String taskName;
    public int getTaskID() {
        return taskID;
    }
    public void setTaskID(int taskID) {
        this.taskID = taskID;
    }
    public String getTaskName() {
        return taskName;
    }
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }
    @Override
    public String toString() {
        return "Task [taskID=" + taskID + ", taskName=" + taskName + "]";
    }

}
