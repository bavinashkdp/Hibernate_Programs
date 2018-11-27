package com.telusko.DemoHib1;

import javax.persistence.Embeddable;

@Embeddable//we r inserting the datas in a same table
public class StudentName 
{
	private String fName;
	private String mName;
	private String lName;
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	@Override
	public String toString() {
		return "StudentName [fName=" + fName + ", mName=" + mName + ", lName=" + lName + "]";
	}
	

}
