package com.prototype.demo.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long eID;
private String efName;
private String elName;
private String eType;
public long geteID() {
	return eID;
}
public void seteID(long eID) {
	this.eID = eID;
}
public String getEfName() {
	return efName;
}
public void setEfName(String efName) {
	this.efName = efName;
}
public String getElName() {
	return elName;
}
public void setElName(String elName) {
	this.elName = elName;
}
public String geteType() {
	return eType;
}
public void seteType(String eType) {
	this.eType = eType;
}
@Override
public String toString() {
	return "Employee [eID=" + eID + ", efName=" + efName + ", elName=" + elName + ", eType=" + eType + "]";
}
public Employee() {
}

}
