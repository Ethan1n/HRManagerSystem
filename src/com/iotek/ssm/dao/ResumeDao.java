package com.iotek.ssm.dao;

import com.iotek.ssm.entity.Resume;

public interface ResumeDao {

	public Integer insertResume(Resume resume);//��Ӽ���
	
	public Integer updateResume(Resume resume);//�޸ļ���
	
	public Resume queryByVistorId(Integer vistorId);//�����ο�ID��ѯ����
}
