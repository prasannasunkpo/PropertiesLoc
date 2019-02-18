package com.apalya.properties;

public class Department {

	private int dId;
	private String deptName;
	
	
	public int getdId() {
		return dId;
	}
	public void setdId(int dId) {
		this.dId = dId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	@Override
	public String toString() {
		return "Department [dId=" + dId + ", deptName=" + deptName + "]";
	}
	
	
	
}
