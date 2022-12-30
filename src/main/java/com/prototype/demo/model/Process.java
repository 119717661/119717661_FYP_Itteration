package com.prototype.demo.model;

import java.util.List;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;

import javax.persistence.Table;

@Entity
@Table(name="Process")
public class Process {
    @Id
    @Column(name="procID", nullable=false, unique=true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long procID;

    @Column(name="procName", nullable=false)
    private String procName;

    @OneToMany(mappedBy = "process")
    private List<Task> tasks;

    
    public Long getProcID() {
        return procID;
    }

    public void setProcID(Long procID) {
        this.procID = procID;
    }

    public String getProcName() {
        return procName;
    }

    public void setProcName(String procName) {
        this.procName = procName;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    @Override
    public String toString() {
        return "Process [procID=" + procID + ", procName=" + procName + ", tasks=" + tasks + "]";
    }

   
}
