package com.iotek.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iotek.ssm.dao.DepartmentDao;
import com.iotek.ssm.dao.EmployeeDao;
import com.iotek.ssm.dao.PositionDao;
import com.iotek.ssm.entity.Department;
import com.iotek.ssm.entity.Employee;
import com.iotek.ssm.entity.Position;
import com.iotek.ssm.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	@Autowired
	private DepartmentDao departmentDao;
	@Autowired
	private PositionDao positionDao;

	@Override
	public Employee employeeLogin(Employee employee) {
		Employee employee1=employeeDao.queryByEmployeeNameAndPwd(employee);
		return employee1;
	}

	@Override
	public Employee findEmployeeById(Integer EmployeeId) {
		Employee employee=employeeDao.queryEmployeeById(EmployeeId);
		return employee;
	}

	@Override
	public Boolean modifyEmployee(Employee employee) {
		Integer res=employeeDao.updateEmployee(employee);
		return res>0?true:false;
	}

	@Override
	public List<Department> findAllDepartment() {
		List<Department> departments=departmentDao.queryAllDepartment();
		return departments;
	}

	@Override
	public List<Position> findPosiByDepartmentId(Integer departmentId) {
		List<Position> positions=positionDao.queryByDepartmentId(departmentId);
		return positions;
	}

	@Override
	public List<Employee> findEmplByDepartmentId(Integer departmentId) {
		List<Employee> employees=employeeDao.queryByDepartmentId(departmentId);
		return employees;
	}
	

}
