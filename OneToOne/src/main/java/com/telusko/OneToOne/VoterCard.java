package com.telusko.OneToOne;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class VoterCard 
{
	@Id
	private int vId;
	private String vName;
	private String vPlace;
	public int getvId() {
		return vId;
	}
	public void setvId(int vId) {
		this.vId = vId;
	}
	public String getvName() {
		return vName;
	}
	public void setvName(String vName) {
		this.vName = vName;
	}
	public String getvPlace() {
		return vPlace;
	}
	public void setvPlace(String vPlace) {
		this.vPlace = vPlace;
	}
	@Override
	public String toString() {
		return "VoterCard [vId=" + vId + ", vName=" + vName + ", vPlace=" + vPlace + "]";
	}
	

}
