package com.telusko.ManyToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name="student4")
public class Student 
{
	@Id
	private int sId;
	private String sName;
	private int marks;
	@ManyToMany(mappedBy="students")//mapping is done by students (laptop4_student4)
	private List<LapTop>lapTops=new ArrayList<LapTop>();
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
	public List<LapTop> getLapTops() {
		return lapTops;
	}
	public void setLapTops(List<LapTop> lapTops) {
		this.lapTops = lapTops;
	}
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", marks=" + marks + ", lapTops=" + lapTops + "]";
	}
	

}
