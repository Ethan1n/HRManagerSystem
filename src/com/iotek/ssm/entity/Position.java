package com.iotek.ssm.entity;

import java.util.Date;

public class Position {

	private Integer positionId;
	private String positionName;
	private Date posicreateTime;
	private Department department;
	
	public Position(Integer positionId, String positionName, Date posicreateTime, Department department) {
		super();
		this.positionId = positionId;
		this.positionName = positionName;
		this.posicreateTime = posicreateTime;
		this.department = department;
	}
	
	public Position() {
		super();
	}
	
	public Integer getPositionId() {
		return positionId;
	}
	
	public void setPositionId(Integer positionId) {
		this.positionId = positionId;
	}
	
	public String getPositionName() {
		return positionName;
	}
	
	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}
	
	public Date getPosicreateTime() {
		return posicreateTime;
	}
	
	public void setPosicreateTime(Date posicreateTime) {
		this.posicreateTime = posicreateTime;
	}
	
	public Department getDepartment() {
		return department;
	}
	
	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Position [positionId=" + positionId + ", positionName=" + positionName + ", posicreateTime="
				+ posicreateTime + ", department=" + department + "]";
	}
	
}
