package com.telusko.DemoHib;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity//entity name
@Table(name="student_table")//table name
public class Student //class name
{
	@Id//primarykey column mandatory
	@Column(name="id")
	private int sId;
	@Column(name="name")//to change the column name of table
	private String sName;
	//@Transient//below column wont be stored into data base
	@Column(name="Branch")
	private String branch;
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
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", branch=" + branch + "]";
	}
	

}
