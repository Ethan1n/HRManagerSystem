package com.iotek.ssm.service;

import java.util.List;

import com.iotek.ssm.entity.Department;
import com.iotek.ssm.entity.Employee;
import com.iotek.ssm.entity.Position;

public interface EmployeeService {

	public Employee employeeLogin(Employee employee);//Ա����¼
	
	public Employee findEmployeeById(Integer EmployeeId);//Ա���鿴�Լ��ĸ�����Ϣ
	
	public Boolean modifyEmployee(Employee employee);//Ա���޸��Լ��ĸ�����Ϣ
	
	//�鿴��˾���еĲ���
	public List<Department> findAllDepartment();
	
	//�����µ�����ְλ��Ϣ
	public List<Position> findPosiByDepartmentId(Integer departmentId);
	
	//�鿴ĳ����ְλ�µ�����ЩԱ��
	public List<Employee> findEmplByDepartmentId(Integer departmentId);
	
	//Ա���������յ�������ѵ��֪ͨ�������ܲ鿴�ô���ѵ���������
	
	//Ա�����Բ鿴�����Լ���صĽ�����Ϣ���������ͽ�����ʱ�䣬����ԭ��
	
	//Ա��ÿ�����°����򿨣����ɴ򿨼�¼
	
}
