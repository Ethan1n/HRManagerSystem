package com.iotek.ssm.dao;

import com.iotek.ssm.entity.Interview;

public interface InterviewDao {

	public Integer insertInterview(Interview interview);//����һ��������Ϣ
	
	public Interview queryByVistorId(Integer vistorId);//��ѯĳһ�ο͵�������Ϣ
}
