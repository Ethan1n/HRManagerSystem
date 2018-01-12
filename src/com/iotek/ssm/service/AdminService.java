package com.iotek.ssm.service;


import java.util.List;

import com.iotek.ssm.entity.Admin;
import com.iotek.ssm.entity.Candidates;
import com.iotek.ssm.entity.Department;
import com.iotek.ssm.entity.Employee;
import com.iotek.ssm.entity.Interview;
import com.iotek.ssm.entity.Position;
import com.iotek.ssm.entity.Recruit;
import com.iotek.ssm.entity.Resume;

public interface AdminService {

	public Admin adminLogin(Admin admin);//管理员登录
	
	/*
	 * 部门
	 */
	public Boolean addDepartment(Department department);//添加部门
	
	public Boolean removeDepartment(Integer departmentId);//删除部门
	
	public Boolean modifyDepartment(Department department);//修改部门信息
	
	public List<Department> findAllDepartment();//查询所有部门
	
	public Department findDepartmentById(Integer departmentId);//查询单个部门
	
	public List<Position> findAllPositionByDeptId(Integer departmentId);//通过查看某部门，查看该部门下的所有职位
	
	public List<Employee> findAllEmployeeByDeptId(Integer departmentId);//通过查看某部门，查看该部门下的所有员工
	
	/*
	 * 职位
	 */
	public Boolean addPosition(Position position);//添加职位
	
	public Boolean removePosition(Integer positionId);//删除职位
	
	public Boolean modifyPosition(Position position);//更新职位
	
	public List<Position> findAllPosition();//查看所有职位
	
	public Position findPositionById(Integer positionId);//查看单个职位
	
	public List<Employee> findByPositionId(Integer positionId);//通过查看某职位，查看该职位下的员工
	
	/*
	 * 员工
	 */
	public Boolean removeEmployee(Employee employee);//员工离职
	
	public Employee findEmployeeById(Integer employeeId);//查看员工对应的基本信息、部门、职位;
	
	//薪资、培训、绩效、考勤
	
	public Boolean modifyDeptAndPosi(Employee employee);//对员工进行换岗
	
	/*
	 * 招聘
	 */
	public Boolean addRecruit(Recruit recruit);//添加招聘信息
	
	public Boolean removeRecruit(Integer recruitId);//删除招聘信息
	
	public Boolean modifyRecruit(Recruit recruit);//更新招聘信息
	
	public List<Recruit> findAllRecruit();//查询所有招聘信息
	
	/*
	 *应聘 
	 */
	public List<Candidates> receiveResume();//收取简历,根据应聘信息的状态把所有未处理的简历查询出来
	
	public Resume makeMarkToResume(Integer candidatesId, Integer vistorId);//做标记并查阅简历
	
	public Candidates findCandidatesById(Integer candidatesId);//查看某个游客的应聘信息
	
	public Boolean notifyInterview(Interview interview);//通知面试、并记录面试时间
	
	//通知安排员工进行面试
	
	public Boolean addEmployee(Employee employee);//录用员工
 
}
