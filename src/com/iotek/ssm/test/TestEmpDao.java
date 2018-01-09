package com.iotek.ssm.test;

import java.util.Date;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.iotek.ssm.dao.EmployeeDao;
import com.iotek.ssm.entity.Department;
import com.iotek.ssm.entity.Employee;
import com.iotek.ssm.entity.Position;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring*.xml")
public class TestEmpDao {

	@Autowired
	private EmployeeDao empDao;
	
	@Test
	public void testQueryAllEmployee() {
		System.out.println(empDao.queryAllEmployee());
	}
	
	@Test
	public void testInsertEmployee() {
		Employee employee=new Employee(-1, "aaa", "321", "李四", "男", "30", "本科", "13285659874", "14658954@163.com", new Department(2, null, null), new Position(2, null, null, null), "普通群众", new Date(), "听歌", 1, "null");
		System.out.println(empDao.insertEmployee(employee));
	}
	
	@Test
	public void testUpdateEmployee() {
		Employee employee=new Employee();
		employee.setStatus(1);
		System.out.println(empDao.updateEmployee(employee));
	}
	
	@Test
	public void testUpdateDeptAndPosi() {
		Employee employee=new Employee();
		employee.setDepartment(new Department(1, null, null));
		employee.setPosition(new Position(1, null, null, null));
		employee.setEmployeeId(1);
		System.out.println(empDao.updateDeptAndPosi(employee));
	}
	
	@Test
	public void testQueryByDepartmentId() {
		System.out.println(empDao.queryByDepartmentId(1));
	}
	
	
	@Test
	public void testQueryByPositionId() {
		System.out.println(empDao.queryByPositionId(1));
	}
	
	@Test
	public void testQueryByEmployeeNameAndPwd() {
		Employee employee=new Employee();
		employee.setEmployeeName("张三");
		employee.setEmployeePassword("123");
		System.out.println(empDao.queryByEmployeeNameAndPwd(employee));
	}
}
