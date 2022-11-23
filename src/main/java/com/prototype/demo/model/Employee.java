package com.prototype.demo.model;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
@Id
private int eID;
private String efName;
private String elName;
private String eType;
public int geteID() {
	return eID;
}
public void seteID(int eID) {
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

}
