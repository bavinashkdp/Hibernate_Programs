package com.telusko.OneToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="student2")
public class Student
{
	@Id
	private int sId;
	private String sName;
	private int marks;
	@OneToMany
	private List<LapTop> lapTops=new ArrayList<LapTop>();
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
