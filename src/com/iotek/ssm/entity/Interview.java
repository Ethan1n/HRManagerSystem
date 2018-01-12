package com.iotek.ssm.entity;

import java.util.Date;

public class Interview {//√Ê ‘¿‡

	private Integer interviewId;
	private Date interviewDate;
	private Candidates candidates;
	
	public Interview(Integer interviewId, Date interviewDate, Candidates candidates) {
		super();
		this.interviewId = interviewId;
		this.interviewDate = interviewDate;
		this.candidates = candidates;
	}

	public Interview() {
		super();
	}

	public Integer getInterviewId() {
		return interviewId;
	}

	public void setInterviewId(Integer interviewId) {
		this.interviewId = interviewId;
	}

	public Date getInterviewDate() {
		return interviewDate;
	}

	public void setInterviewDate(Date interviewDate) {
		this.interviewDate = interviewDate;
	}

	public Candidates getCandidates() {
		return candidates;
	}

	public void setCandidates(Candidates candidates) {
		this.candidates = candidates;
	}

	@Override
	public String toString() {
		return "Interview [interviewId=" + interviewId + ", interviewDate=" + interviewDate + ", candidates="
				+ candidates + "]";
	}

}
