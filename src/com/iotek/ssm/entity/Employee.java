package com.iotek.ssm.entity;

import java.util.Date;

public class Employee {

	private Integer employeeId;//员工ID
	private String employeeName;//员工名
	private String employeePassword;//员工密码
	private String realName;//真实姓名
	private String gender;//性别
	private String age;//年龄
	private String education;//学历
	private String tel;//联系方式
	private String email;//邮箱
	private Department department;//部门
	private Position position;//职位
	private String politicalStatus;//政治面貌
	private Date entryTime;//录用时间
	private String hobby;//爱好
	private Integer status;//员工状态(1在职, 0离职, -1试用期)
	private String content;//离职原因
	
	public Employee(Integer employeeId, String employeeName, String employeePassword, String realName, String gender, String age,
			String education, String tel, String email, Department department, Position position, String politicalStatus,
			Date entryTime, String hobby, Integer status, String content) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeePassword = employeePassword;
		this.realName = realName;
		this.gender = gender;
		this.age = age;
		this.education = education;
		this.tel = tel;
		this.email = email;
		this.department = department;
		this.position = position;
		this.politicalStatus = politicalStatus;
		this.entryTime = entryTime;
		this.hobby = hobby;
		this.status = status;
		this.content = content;
	}

	public Employee(String employeeName, String employeePassword) {
		super();
		this.employeeName = employeeName;
		this.employeePassword = employeePassword;
	}

	public Employee() {
		super();
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeePassword() {
		return employeePassword;
	}

	public void setEmployeePassword(String employeePassword) {
		this.employeePassword = employeePassword;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getPoliticalStatus() {
		return politicalStatus;
	}

	public void setPoliticalStatus(String politicalStatus) {
		this.politicalStatus = politicalStatus;
	}

	public Date getEntryTime() {
		return entryTime;
	}

	public void setEntryTime(Date entryTime) {
		this.entryTime = entryTime;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeePassword="
				+ employeePassword + ", realName=" + realName + ", gender=" + gender + ", age=" + age + ", education="
				+ education + ", tel=" + tel + ", email=" + email + ", department=" + department + ", position="
				+ position + ", politicalStatus=" + politicalStatus + ", entryTime=" + entryTime + ", hobby=" + hobby
				+ ", status=" + status + ", content=" + content + "]";
	}

}
