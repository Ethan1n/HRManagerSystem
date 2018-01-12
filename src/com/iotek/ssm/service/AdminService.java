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

	public Admin adminLogin(Admin admin);//����Ա��¼
	
	/*
	 * ����
	 */
	public Boolean addDepartment(Department department);//��Ӳ���
	
	public Boolean removeDepartment(Integer departmentId);//ɾ������
	
	public Boolean modifyDepartment(Department department);//�޸Ĳ�����Ϣ
	
	public List<Department> findAllDepartment();//��ѯ���в���
	
	public Department findDepartmentById(Integer departmentId);//��ѯ��������
	
	public List<Position> findAllPositionByDeptId(Integer departmentId);//ͨ���鿴ĳ���ţ��鿴�ò����µ�����ְλ
	
	public List<Employee> findAllEmployeeByDeptId(Integer departmentId);//ͨ���鿴ĳ���ţ��鿴�ò����µ�����Ա��
	
	/*
	 * ְλ
	 */
	public Boolean addPosition(Position position);//���ְλ
	
	public Boolean removePosition(Integer positionId);//ɾ��ְλ
	
	public Boolean modifyPosition(Position position);//����ְλ
	
	public List<Position> findAllPosition();//�鿴����ְλ
	
	public Position findPositionById(Integer positionId);//�鿴����ְλ
	
	public List<Employee> findByPositionId(Integer positionId);//ͨ���鿴ĳְλ���鿴��ְλ�µ�Ա��
	
	/*
	 * Ա��
	 */
	public Boolean removeEmployee(Employee employee);//Ա����ְ
	
	public Employee findEmployeeById(Integer employeeId);//�鿴Ա����Ӧ�Ļ�����Ϣ�����š�ְλ;
	
	//н�ʡ���ѵ����Ч������
	
	public Boolean modifyDeptAndPosi(Employee employee);//��Ա�����л���
	
	/*
	 * ��Ƹ
	 */
	public Boolean addRecruit(Recruit recruit);//�����Ƹ��Ϣ
	
	public Boolean removeRecruit(Integer recruitId);//ɾ����Ƹ��Ϣ
	
	public Boolean modifyRecruit(Recruit recruit);//������Ƹ��Ϣ
	
	public List<Recruit> findAllRecruit();//��ѯ������Ƹ��Ϣ
	
	/*
	 *ӦƸ 
	 */
	public List<Candidates> receiveResume();//��ȡ����,����ӦƸ��Ϣ��״̬������δ����ļ�����ѯ����
	
	public Resume makeMarkToResume(Integer candidatesId, Integer vistorId);//����ǲ����ļ���
	
	public Candidates findCandidatesById(Integer candidatesId);//�鿴ĳ���ο͵�ӦƸ��Ϣ
	
	public Boolean notifyInterview(Interview interview);//֪ͨ���ԡ�����¼����ʱ��
	
	//֪ͨ����Ա����������
	
	public Boolean addEmployee(Employee employee);//¼��Ա��
 
}
