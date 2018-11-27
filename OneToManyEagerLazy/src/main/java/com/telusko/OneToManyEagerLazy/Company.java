package com.telusko.OneToManyEagerLazy;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Company
{
	@Id
	private int cId;
	private String cName;
	@OneToMany( fetch=FetchType.EAGER)
	private List<Employee>employees=new ArrayList<Employee>();

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Company [cId=" + cId + ", cName=" + cName + ", employees=" + employees + "]";
	}
	

}
