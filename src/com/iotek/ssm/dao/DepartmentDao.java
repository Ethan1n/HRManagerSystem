package com.iotek.ssm.dao;

import java.util.List;

import com.iotek.ssm.entity.Department;

public interface DepartmentDao {

	public Integer insertDepartment(Department department);//��Ӳ���
	
	public Integer deleteDepartment(Integer departmentId);//ɾ������
	
	public Integer updateDepartment(Department department);//�޸Ĳ�����Ϣ
	
	public List<Department> queryAllDepartment();//��ѯ���в���
	
	public Department queryDepartmentById(Integer departmentId);//����ID��ѯ����
}
