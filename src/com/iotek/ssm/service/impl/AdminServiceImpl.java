package com.iotek.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iotek.ssm.dao.AdminDao;
import com.iotek.ssm.dao.CandidatesDao;
import com.iotek.ssm.dao.DepartmentDao;
import com.iotek.ssm.dao.EmployeeDao;
import com.iotek.ssm.dao.InterviewDao;
import com.iotek.ssm.dao.PositionDao;
import com.iotek.ssm.dao.RecruitDao;
import com.iotek.ssm.dao.ResumeDao;
import com.iotek.ssm.entity.Admin;
import com.iotek.ssm.entity.Candidates;
import com.iotek.ssm.entity.Department;
import com.iotek.ssm.entity.Employee;
import com.iotek.ssm.entity.Interview;
import com.iotek.ssm.entity.Position;
import com.iotek.ssm.entity.Recruit;
import com.iotek.ssm.entity.Resume;
import com.iotek.ssm.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminDao adminDao;
	@Autowired
	private DepartmentDao departmentDao;
	@Autowired
	private PositionDao positionDao;
	@Autowired
	private EmployeeDao employeeDao;
	@Autowired
	private RecruitDao recruitDao;
	@Autowired
	private CandidatesDao candidatesDao;
	@Autowired
	private ResumeDao resumeDao;
	@Autowired
	private InterviewDao interviewDao;
	
	@Override
	public Admin adminLogin(Admin admin) {
		return adminDao.queryByAdminNameAndPwd(admin);
	}

	@Override
	public Boolean addDepartment(Department department) {
		Integer res=departmentDao.insertDepartment(department);
		return res>0?true:false;
	}

	@Override
	public Boolean removeDepartment(Integer departmentId) {
		Integer res=departmentDao.deleteDepartment(departmentId);
		return res>0?true:false;
	}

	@Override
	public Boolean modifyDepartment(Department department) {
		Integer res=departmentDao.updateDepartment(department);
		return res>0?true:false;
	}

	@Override
	public List<Department> findAllDepartment() {
		List<Department> departments=departmentDao.queryAllDepartment();
		return departments;
	}

	@Override
	public List<Position> findAllPositionByDeptId(Integer departmentId) {
		List<Position> positions=positionDao.queryByDepartmentId(departmentId);
		return positions;
	}

	@Override
	public List<Employee> findAllEmployeeByDeptId(Integer departmentId) {
		List<Employee> employees=employeeDao.queryByDepartmentId(departmentId);
		return employees;
	}

	@Override
	public Boolean addPosition(Position position) {
		Integer res=positionDao.insertPosition(position);
		return res>0?true:false;
	}

	@Override
	public Boolean removePosition(Integer positionId) {
		Integer res=positionDao.deletePosition(positionId);
		return res>0?true:false;
	}

	@Override
	public Boolean modifyPosition(Position position) {
		Integer res=positionDao.updatePosition(position);
		return res>0?true:false;
	}

	@Override
	public List<Position> findAllPosition() {
		List<Position> positions=positionDao.queryAllPosition();
		return positions;
	}

	@Override
	public List<Employee> findByPositionId(Integer positionId) {
		List<Employee> employees=employeeDao.queryByPositionId(positionId);
		return employees;
	}

	@Override
	public Boolean addRecruit(Recruit recruit) {
		Integer res=recruitDao.insertRecruit(recruit);
		return res>0?true:false;
	}

	@Override
	public Boolean removeRecruit(Integer recruitId) {
		Integer res=recruitDao.deleteRecruit(recruitId);
		return res>0?true:false;
	}

	@Override
	public Boolean modifyRecruit(Recruit recruit) {
		Integer res=recruitDao.updateRecruit(recruit);
		return res>0?true:false;
	}

	@Override
	public List<Recruit> findAllRecruit() {
		List<Recruit> recruits=recruitDao.queryAllRecruit();
		return recruits;
	}

	@Override
	public List<Candidates> receiveResume(Integer status) {
		List<Candidates> candidateses=candidatesDao.queryAllCandidatesByStatus(status);
		return candidateses;
	}

	@Override
	public Resume findResumeByVistorId(Integer vistorId) {
		Resume resume=resumeDao.queryByVistorId(vistorId);
		return resume;
	}

	@Override
	public Boolean makeMarkToResume(Candidates candidates) {
		Integer res=candidatesDao.updateCandidates(candidates);
		return res>0?true:false;
	}

	@Override
	public Boolean addEmployee(Employee employee) {
		Integer res=employeeDao.insertEmployee(employee);
		return res>0?true:false;
	}

	@Override
	public Boolean removeEmployee(Employee employee) {
		Integer res=employeeDao.updateStatusAndContent(employee);
		return res>0?true:false;
	}

	@Override
	public Employee findEmployeeById(Integer employeeId) {
		Employee employee=employeeDao.queryEmployeeById(employeeId);
		return employee;
	}

	@Override
	public Boolean modifyDeptAndPosi(Employee employee) {
		Integer res=employeeDao.updateDeptAndPosi(employee);
		return res>0?true:false;
	}

	@Override
	public Boolean notifyInterview(Interview interview) {
		Integer res=interviewDao.insertInterview(interview);
		return res>0?true:false;
	}

	@Override
	public Interview arrangeInterview(Integer vistorId) {
		Interview interview=interviewDao.queryByVistorId(vistorId);
		return interview;
	}

	@Override
	public Department findDepartmentById(Integer departmentId) {
		Department department=departmentDao.queryDepartmentById(departmentId);
		return department;
	}

	@Override
	public Position findPositionById(Integer positionId) {
		Position position=positionDao.queryPositionById(positionId);
		return position;
	}
}
