package com.iotek.ssm.dao;

import java.util.List;

import com.iotek.ssm.entity.Employee;

public interface EmployeeDao {

	public Integer insertEmployee(Employee employee);//���Ա��
	
	public Integer updateEmployee(Employee employee);//����Ա����Ϣ
	
	public Integer updateDeptAndPosi(Employee employee);//����Ա�����ź�ְλ
	
	public Integer updateStatusAndContent(Employee employee);//Ա����ְ�������ְԭ��
	
	public Employee queryEmployeeById(Integer employeeId);//����ID��ѯԱ��
	
	public List<Employee> queryAllEmployee();//��ѯ����Ա��
	
	public List<Employee> queryByDepartmentId(Integer departmentId);//���ݲ���ID��ѯԱ��
	
	public List<Employee> queryByPositionId(Integer positionId);//����ְλID��ѯԱ��
	
	public Employee queryByEmployeeNameAndPwd(Employee employee);//����Ա�����������ѯԱ��
}
