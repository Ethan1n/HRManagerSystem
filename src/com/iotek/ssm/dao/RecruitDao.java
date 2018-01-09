package com.iotek.ssm.dao;

import java.util.List;

import com.iotek.ssm.entity.Recruit;

public interface RecruitDao {

	public Integer insertRecruit(Recruit recruit);//添加招聘信息
	
	public Integer deleteRecruit(Integer recruitId);//删除招聘信息
	
	public Integer updateRecruit(Recruit recruit);//更新招聘信息
	
	public List<Recruit> queryAllRecruit();//查询所有招聘信息
}
