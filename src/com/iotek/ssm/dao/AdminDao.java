package com.iotek.ssm.dao;

import com.iotek.ssm.entity.Admin;

public interface AdminDao {
	
	//���ݹ���Ա���������ѯ����Ա
	public Admin queryByAdminNameAndPwd(Admin admin);
	
}
