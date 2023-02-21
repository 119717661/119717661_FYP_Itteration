package com.prototype.demo.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Task")
public class Task {
    @Id
    @Column(name="taskID", nullable=false, unique=true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long taskid;

    @Column(name="taskName", nullable=false)
    private String taskname;


    @ManyToOne
    @JoinColumn(name="proc_id", referencedColumnName = "procID")
    private Process process;
    
     public Process getProcess() {
        return process;
    }

    public void setProcess(Process process) {
        this.process = process;
    }

    public Long getTaskid() {
        return taskid;
    }

    public void setTaskid(Long taskid) {
        this.taskid = taskid;
    }

    public String getTaskname() {
        return taskname;
    }

    public void setTaskname(String taskname) {
        this.taskname = taskname;
    }

    @Override
    public String toString() {
        return "Task [taskid=" + taskid + ", taskname=" + taskname + ", process=" + process + "]";
    }

    
}