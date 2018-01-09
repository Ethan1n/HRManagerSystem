package com.iotek.ssm.dao;

import java.util.List;

import com.iotek.ssm.entity.Employee;

public interface EmployeeDao {

	public Integer insertEmployee(Employee employee);//添加员工
	
	public Integer updateEmployee(Employee employee);//更新员工信息
	
	public Integer updateDeptAndPosi(Employee employee);//更新员工部门和职位
	
	public Integer updateStatusAndContent(Employee employee);//员工离职及添加离职原因
	
	public Employee queryEmployeeById(Integer employeeId);//根据ID查询员工
	
	public List<Employee> queryAllEmployee();//查询所有员工
	
	public List<Employee> queryByDepartmentId(Integer departmentId);//根据部门ID查询员工
	
	public List<Employee> queryByPositionId(Integer positionId);//根据职位ID查询员工
	
	public Employee queryByEmployeeNameAndPwd(Employee employee);//根据员工名和密码查询员工
}
