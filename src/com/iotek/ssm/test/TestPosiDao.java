package com.iotek.ssm.test;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.iotek.ssm.dao.PositionDao;
import com.iotek.ssm.entity.Department;
import com.iotek.ssm.entity.Position;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring*.xml")
public class TestPosiDao {

	@Autowired
	private PositionDao posiDao;
	
	@Test
	public void testQueryByDepartmentId() {
		System.out.println(posiDao.queryByDepartmentId(2));
	}
	
	@Test
	public void testInsertPosition() {
		Position position=new Position();
		position.setPositionName("普通员工");
		position.setPosicreateTime(new Date());
		position.setDepartment(new Department(1, null, null));
		System.out.println(posiDao.insertPosition(position));
	}
	
	@Test
	public void testUpdatePosition() {
		Position position=new Position();
		position.setPositionId(4);
		position.setPositionName("组员");
		System.out.println(posiDao.updatePosition(position));
	}
	
	@Test
	public void testDeletePosition() {
		System.out.println(posiDao.deletePosition(4));
	}
}
