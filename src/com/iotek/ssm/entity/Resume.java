package com.iotek.ssm.entity;

public class Resume {

	private Integer resumeId;//简历ID
	private Integer vistorId;//游客ID
	private String realName;//真实姓名
	private String gender;//性别
	private String age;//年龄
	private String education;//学历
	private String tel;//联系方式
	private String email;//邮箱
	private Department applyDepartment;//申请的部门
	private Position applyPosition;//申请的职位
	private String expectedSalary;//期望的薪水
	private String workExperience;//工作经验
	private String lastJob;//上份工作
	private String politicalStatus;//政治面貌
	private String hobby;//爱好
	
	public Resume(Integer resumeId, Integer vistorId, String realName, String gender, String age, String education, String tel,
			String email, Department applyDepartment, Position applyPosition, String expectedSalary, String workExperience,
			String lastJob, String politicalStatus, String hobby) {
		super();
		this.resumeId = resumeId;
		this.vistorId = vistorId;
		this.realName = realName;
		this.gender = gender;
		this.age = age;
		this.education = education;
		this.tel = tel;
		this.email = email;
		this.applyDepartment = applyDepartment;
		this.applyPosition = applyPosition;
		this.expectedSalary = expectedSalary;
		this.workExperience = workExperience;
		this.lastJob = lastJob;
		this.politicalStatus = politicalStatus;
		this.hobby = hobby;
	}

	public Resume() {
		super();
	}

	public Integer getResumeId() {
		return resumeId;
	}

	public void setResumeId(Integer resumeId) {
		this.resumeId = resumeId;
	}

	public Integer getVistorId() {
		return vistorId;
	}

	public void setVistorId(Integer vistorId) {
		this.vistorId = vistorId;
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

	public Department getApplyDepartment() {
		return applyDepartment;
	}

	public void setApplyDepartment(Department applyDepartment) {
		this.applyDepartment = applyDepartment;
	}

	public Position getApplyPosition() {
		return applyPosition;
	}

	public void setApplyPosition(Position applyPosition) {
		this.applyPosition = applyPosition;
	}

	public String getExpectedSalary() {
		return expectedSalary;
	}

	public void setExpectedSalary(String expectedSalary) {
		this.expectedSalary = expectedSalary;
	}

	public String getWorkExperience() {
		return workExperience;
	}

	public void setWorkExperience(String workExperience) {
		this.workExperience = workExperience;
	}

	public String getLastJob() {
		return lastJob;
	}

	public void setLastJob(String lastJob) {
		this.lastJob = lastJob;
	}

	public String getPoliticalStatus() {
		return politicalStatus;
	}

	public void setPoliticalStatus(String politicalStatus) {
		this.politicalStatus = politicalStatus;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	@Override
	public String toString() {
		return "Resume [resumeId=" + resumeId + ", vistorId=" + vistorId + ", realName=" + realName + ", gender="
				+ gender + ", age=" + age + ", education=" + education + ", tel=" + tel + ", email=" + email
				+ ", applyDepartment=" + applyDepartment + ", applyPosition=" + applyPosition + ", expectedSalary="
				+ expectedSalary + ", workExperience=" + workExperience + ", lastJob=" + lastJob + ", politicalStatus="
				+ politicalStatus + ", hobby=" + hobby + "]";
	}

}
