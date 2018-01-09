package com.iotek.ssm.dao;

import com.iotek.ssm.entity.Interview;

public interface InterviewDao {

	public Integer insertInterview(Interview interview);//新增一条面试信息
	
	public Interview queryByVistorId(Integer vistorId);//查询某一游客的面试信息
}
