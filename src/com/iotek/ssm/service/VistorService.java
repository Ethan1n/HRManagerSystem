package com.iotek.ssm.service;

import java.util.List;

import com.iotek.ssm.entity.Candidates;
import com.iotek.ssm.entity.Recruit;
import com.iotek.ssm.entity.Resume;
import com.iotek.ssm.entity.Vistor;

public interface VistorService {

	public Vistor vistorLogin(Vistor vistor);//游客登录
	
	public Boolean vistorRegister(Vistor vistor);//游客注册账户
	
	public List<Recruit> findAllRecruit();//浏览招聘信息
	
	public Boolean writeResume(Resume resume);//填写公司简历
	
	public Boolean modifyResume(Resume resume);//修改简历
	
	public Resume findResumeByVistorId(Integer vistorId);//根据游客ID查看简历
	
	public Boolean sendResume(Candidates candidates);//投递简历,往应聘表中添加一条数据
	
	//接受面试邀请
	
	public Boolean modifyVistorPwd(Vistor vistor);//游客修改密码
}
