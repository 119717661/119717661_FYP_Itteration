package com.prototype.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Process {
    @Id
    private int procID;
    private String procName;
    public int getProcID() {
        return procID;
    }
    public void setProcID(int procID) {
        this.procID = procID;
    }
    public String getProcName() {
        return procName;
    }
    public void setProcName(String procName) {
        this.procName = procName;
    }
    @Override
    public String toString() {
        return "Process [procID=" + procID + ", procName=" + procName + "]";
    }
    

}
