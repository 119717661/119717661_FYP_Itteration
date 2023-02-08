package com.prototype.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Gemba {
@Id
@Column(name="gembaID", nullable=false, unique=true)
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int gembaID;
private int submissionCount; // new field
public int getSubmissionCount() {
    return submissionCount;
}

public void setSubmissionCount(int submissionCount) {
    this.submissionCount = submissionCount;
}

private long taskID;
private String taskName;
private String processName;
private String timeOfTask;


public int getGembaID() {
    return gembaID;
}

public void setGembaID(int gembaID) {
    this.gembaID = gembaID;
}

public long getTaskID() {
    return taskID;
}

public void setTaskID(long taskID) {
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
