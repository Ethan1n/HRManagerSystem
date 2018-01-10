package com.iotek.ssm.dao;

import java.util.List;

import com.iotek.ssm.entity.Department;

public interface DepartmentDao {

	public Integer insertDepartment(Department department);//添加部门
	
	public Integer deleteDepartment(Integer departmentId);//删除部门
	
	public Integer updateDepartment(Department department);//修改部门信息
	
	public List<Department> queryAllDepartment();//查询所有部门
	
	public Department queryDepartmentById(Integer departmentId);//根据ID查询部门
}
