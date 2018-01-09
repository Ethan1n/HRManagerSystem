package com.iotek.ssm.entity;

import java.util.Date;

public class Department {
	
	private Integer departmentId;
	private String departmentName;
	private Date deptcreateTime;
	
	public Department(Integer departmentId, String departmentName, Date deptcreateTime) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.deptcreateTime = deptcreateTime;
	}

	public Department() {
		super();
	}

	public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Date getDeptcreateTime() {
		return deptcreateTime;
	}

	public void setDeptcreateTime(Date deptcreateTime) {
		this.deptcreateTime = deptcreateTime;
	}

	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + ", deptcreateTime="
				+ deptcreateTime + "]";
	}

}
