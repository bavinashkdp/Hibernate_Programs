package com.telusko.OneToOne;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LapTop 
{
	@Id
	private int lId;
	private String lName;
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
	@Override
	public String toString() {
		return "LapTop [lId=" + lId + ", lName=" + lName + "]";
	}
	

}
