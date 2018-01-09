package com.iotek.ssm.entity;

import java.util.Date;

public class Candidates {//应聘类

	private Integer candidatesId;
	private Integer vistorId;//投递简历的游客ID
	private Date deliveryTime;//投递简历的时间
	private Integer status;//应聘申请的状态(0未查看, 1已查看)
	
	public Candidates(Integer candidatesId, Integer vistorId, Date deliveryTime, Integer status) {
		super();
		this.candidatesId = candidatesId;
		this.vistorId = vistorId;
		this.deliveryTime = deliveryTime;
		this.status = status;
	}

	public Candidates() {
		super();
	}

	public Integer getCandidatesId() {
		return candidatesId;
	}

	public void setCandidatesId(Integer candidatesId) {
		this.candidatesId = candidatesId;
	}

	public Integer getVistorId() {
		return vistorId;
	}

	public void setVistorId(Integer vistorId) {
		this.vistorId = vistorId;
	}

	public Date getDeliveryTime() {
		return deliveryTime;
	}

	public void setDeliveryTime(Date deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Candidates [vistorId=" + vistorId + ", deliveryTime=" + deliveryTime + ", status="
				+ status + "]";
	}
}
