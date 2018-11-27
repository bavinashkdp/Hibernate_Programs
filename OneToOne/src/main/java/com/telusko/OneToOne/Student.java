package com.telusko.OneToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="student1")
public class Student
{
	@Id
	private int sId;
	private String sName;
	private int marks;
	@OneToOne
	private LapTop lapTop;
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	public LapTop getLapTop() {
		return lapTop;
	}
	public void setLapTop(LapTop lapTop) {
		this.lapTop = lapTop;
	}
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", marks=" + marks + ", lapTop=" + lapTop + "]";
	}
	

}
