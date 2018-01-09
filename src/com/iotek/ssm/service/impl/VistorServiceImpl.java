package com.iotek.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iotek.ssm.dao.CandidatesDao;
import com.iotek.ssm.dao.RecruitDao;
import com.iotek.ssm.dao.ResumeDao;
import com.iotek.ssm.dao.VistorDao;
import com.iotek.ssm.entity.Candidates;
import com.iotek.ssm.entity.Recruit;
import com.iotek.ssm.entity.Resume;
import com.iotek.ssm.entity.Vistor;
import com.iotek.ssm.service.VistorService;

@Service
public class VistorServiceImpl implements VistorService {

	@Autowired
	private VistorDao vistorDao;
	@Autowired
	private RecruitDao recruitDao;
	@Autowired
	private ResumeDao resumeDao;
	@Autowired
	private CandidatesDao candidatesDao;
	
	
	@Override
	public Vistor vistorLogin(Vistor vistor) {
		Vistor temp_vistor=vistorDao.queryByVistorNameAndPwd(vistor);
		return temp_vistor;
	}

	@Override
	public Boolean vistorRegister(Vistor vistor) {
		Integer res=vistorDao.insertVistor(vistor);
		return res>0?true:false;
	}

	@Override
	public List<Recruit> findAllRecruit() {
		List<Recruit> recruits=recruitDao.queryAllRecruit();
		return recruits;
	}

	@Override
	public Boolean writeResume(Resume resume) {
		Integer res=resumeDao.insertResume(resume);
		return res>0?true:false;
	}

	@Override
	public Boolean modifyResume(Resume resume) {
		Integer res=resumeDao.updateResume(resume);
		return res>0?true:false;
	}

	@Override
	public Boolean sendResume(Candidates candidates) {
		Integer res=candidatesDao.insertCandidates(candidates);
		return res>0?true:false;
	}

	@Override
	public Resume findResumeByVistorId(Integer vistorId) {
		Resume resume=resumeDao.queryByVistorId(vistorId);
		return resume;
	}

}
