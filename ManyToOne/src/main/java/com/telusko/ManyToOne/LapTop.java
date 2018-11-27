package com.telusko.ManyToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="laptop3")
public class LapTop
{
	@Id
	private int lId;
	private String lName;
	@ManyToOne
	private Student student;
	public int getlId() {
		return lId;
	}
	public void setlId(int lId) {
		this.lId = lId;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "LapTop [lId=" + lId + ", lName=" + lName + ", student=" + student + "]";
	}
	
	

}
