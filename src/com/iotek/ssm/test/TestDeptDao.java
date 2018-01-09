package com.iotek.ssm.test;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.iotek.ssm.dao.DepartmentDao;
import com.iotek.ssm.entity.Department;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring*.xml")
public class TestDeptDao {

	@Autowired
	private DepartmentDao deptDao;
	
	@Test
	public void testQueryAllDepartment() {
		System.out.println(deptDao.queryAllDepartment());
	}
	
	@Test
	public void testInsertDepartment() {
		Department department=new Department();
		department.setDepartmentName("产品部");
		department.setDeptcreateTime(new Date());
		System.out.println(deptDao.insertDepartment(department));
	}
	
	@Test
	public void testUpdateDepartment() {
		Department department=new Department();
		department.setDepartmentName("广告部");
		department.setDepartmentId(4);
		System.out.println(deptDao.updateDepartment(department));
	}
	
	@Test
	public void testDeleteDepartment() {
		System.out.println(deptDao.deleteDepartment(4));
	}
}
