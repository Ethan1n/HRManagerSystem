package com.iotek.ssm.dao;

import com.iotek.ssm.entity.Vistor;

public interface VistorDao {

	public Integer insertVistor(Vistor vistor);//����ο�
	
	public Integer deleteVistor(String vistorName);//ɾ���ο�
	
	public Vistor queryByVistorId(Integer vistor_id);//����ID��ѯ�ο�
	
	public Vistor queryByVistorNameAndPwd(Vistor vistor);//�����ο����������ѯ�ο�
}
