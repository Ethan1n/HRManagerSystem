package com.iotek.ssm.entity;

public class Recruit {//��Ƹ��

	private Integer recruitId;
	private String companyName;//��˾��
	private Department department;//��Ƹ�Ĳ���
	private Position position;//��Ƹ��ְλ
	private String companyAdd;//��˾��ַ
	
	public Recruit(Integer recruitId, String companyName, Department department, Position position,
			String companyAdd) {
		super();
		this.recruitId = recruitId;
		this.companyName = companyName;
		this.department = department;
		this.position = position;
		this.companyAdd = companyAdd;
	}

	public Recruit() {
		super();
	}

	public Integer getRecruitId() {
		return recruitId;
	}

	public void setRecruitId(Integer recruitId) {
		this.recruitId = recruitId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public String getCompanyAdd() {
		return companyAdd;
	}

	public void setCompanyAdd(String companyAdd) {
		this.companyAdd = companyAdd;
	}

	@Override
	public String toString() {
		return "Recruitment [companyName=" + companyName + ", department=" + department + ", position=" + position
				+ ", companyAdd=" + companyAdd + "]";
	}
}
