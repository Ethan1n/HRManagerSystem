package com.iotek.ssm.dao;

import com.iotek.ssm.entity.Admin;

public interface AdminDao {
	
	//根据管理员名和密码查询管理员
	public Admin queryByAdminNameAndPwd(Admin admin);
	
}
