package com.iotek.ssm.dao;

import java.util.List;

import com.iotek.ssm.entity.Recruit;

public interface RecruitDao {

	public Integer insertRecruit(Recruit recruit);//�����Ƹ��Ϣ
	
	public Integer deleteRecruit(Integer recruitId);//ɾ����Ƹ��Ϣ
	
	public Integer updateRecruit(Recruit recruit);//������Ƹ��Ϣ
	
	public List<Recruit> queryAllRecruit();//��ѯ������Ƹ��Ϣ
}
