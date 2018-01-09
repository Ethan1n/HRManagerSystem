package com.iotek.ssm.dao;

import com.iotek.ssm.entity.Vistor;

public interface VistorDao {

	public Integer insertVistor(Vistor vistor);//添加游客
	
	public Integer deleteVistor(String vistorName);//删除游客
	
	public Vistor queryByVistorId(Integer vistor_id);//根据ID查询游客
	
	public Vistor queryByVistorNameAndPwd(Vistor vistor);//根据游客名和密码查询游客
}
