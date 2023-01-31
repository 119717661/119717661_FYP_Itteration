package com.prototype.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Gemba {
@Id
private int gembaID;
private int taskID;
private String taskName;
private String processName;
private String timeOfTask;

public int getGembaID() {
    return gembaID;
}

public void setGembaID(int gembaID) {
    this.gembaID = gembaID;
}

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


}
