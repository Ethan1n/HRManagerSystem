package com.iotek.ssm.service;

import java.util.List;

import com.iotek.ssm.entity.Department;
import com.iotek.ssm.entity.Employee;
import com.iotek.ssm.entity.Position;

public interface EmployeeService {

	public Employee employeeLogin(Employee employee);//员工登录
	
	public Employee findEmployeeById(Integer EmployeeId);//员工查看自己的个人信息
	
	public Boolean modifyEmployee(Employee employee);//员工修改自己的个人信息
	
	//查看公司所有的部门
	public List<Department> findAllDepartment();
	
	//部门下的所有职位信息
	public List<Position> findPosiByDepartmentId(Integer departmentId);
	
	//查看某部门职位下的有哪些员工
	public List<Employee> findEmplByDepartmentId(Integer departmentId);
	
	//员工必须能收到关于培训的通知，并且能查看该次培训的相关内容
	
	//员工可以查看到与自己相关的奖惩信息，包括奖惩金额，奖惩时间，奖惩原因
	
	//员工每天上下班必须打卡，生成打卡记录
	
}
