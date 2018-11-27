package com.telusko.DemoHib1;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student 
{
	@Id
	private int sId;
	private StudentName studentName;
	private String sBranch;
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public StudentName getStudentName() {
		return studentName;
	}
	public void setStudentName(StudentName studentName) {
		this.studentName = studentName;
	}
	public String getsBranch() {
		return sBranch;
	}
	public void setsBranch(String sBranch) {
		this.sBranch = sBranch;
	}
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", studentName=" + studentName + ", sBranch=" + sBranch + "]";
	}
	

	
}
