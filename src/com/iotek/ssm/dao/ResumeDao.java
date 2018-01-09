package com.iotek.ssm.dao;

import com.iotek.ssm.entity.Resume;

public interface ResumeDao {

	public Integer insertResume(Resume resume);//添加简历
	
	public Integer updateResume(Resume resume);//修改简历
	
	public Resume queryByVistorId(Integer vistorId);//根据游客ID查询简历
}
