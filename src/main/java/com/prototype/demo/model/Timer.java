package com.prototype.demo.model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Timer {
   @Id 
    private int timeID;
    private Double timestop;



    @OneToOne
    @JoinColumn(name="task_id", referencedColumnName = "taskID")
    private Task task;

    public Double getTimestop() {
        return timestop;
    }

    public void setTimestop(Double timestop) {
        this.timestop = timestop;
    }

    public int getTimeID() {
        return timeID;
    }

    public void setTimeID(int timeID) {
        this.timeID = timeID;
    }

}
