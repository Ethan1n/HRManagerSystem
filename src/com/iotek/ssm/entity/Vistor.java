package com.iotek.ssm.entity;

public class Vistor {

	private Integer vistorId;//游客ID
	private String vistorName;//游客名
	private String vistorPassword;//游客密码
	
	public Vistor(Integer vistorId, String vistorName, String vistorPassword) {
		super();
		this.vistorId = vistorId;
		this.vistorName = vistorName;
		this.vistorPassword = vistorPassword;
	}

	public Vistor(String vistorName, String vistorPassword) {
		super();
		this.vistorName = vistorName;
		this.vistorPassword = vistorPassword;
	}

	public Vistor() {
		super();
	}

	public Integer getVistorId() {
		return vistorId;
	}

	public void setVistorId(Integer vistorId) {
		this.vistorId = vistorId;
	}

	public String getVistorName() {
		return vistorName;
	}

	public void setVistorName(String vistorName) {
		this.vistorName = vistorName;
	}

	public String getVistorPassword() {
		return vistorPassword;
	}

	public void setVistorPassword(String vistorPassword) {
		this.vistorPassword = vistorPassword;
	}

	@Override
	public String toString() {
		return "Vistor [vistorId=" + vistorId + ", vistorName=" + vistorName + ", vistorPassword=" + vistorPassword
				+ "]";
	}
}
