package com.iotek.ssm.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.iotek.ssm.dao.RecruitDao;
import com.iotek.ssm.entity.Department;
import com.iotek.ssm.entity.Position;
import com.iotek.ssm.entity.Recruit;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring*.xml")
public class TestRecruitDao {

	@Autowired
	private RecruitDao recruitDao;
	
	@Test
	public void testInsertRecruit() {
		Recruit recruit=new Recruit();
		recruit.setCompanyName("中软国际科技公司");
		recruit.setDepartment(new Department(1, null, null));
		recruit.setPosition(new Position(1, null, null, null));
		recruit.setCompanyAdd("南京路");
		System.out.println(recruitDao.insertRecruit(recruit));
	}
	
	@Test
	public void testDeleteRecruit() {
		System.out.println(recruitDao.deleteRecruit(1));
	}
	
	@Test
	public void testUpdateRecruit() {
		Recruit recruit=new Recruit();
		recruit.setRecruitId(1);
		recruit.setCompanyName("海同科技公司");
		recruit.setDepartment(new Department(2, null, null));
		recruit.setPosition(new Position(2, null, null, null));
		recruit.setCompanyAdd("漕溪路");
		System.out.println(recruitDao.updateRecruit(recruit));
	}
	
	@Test
	public void testQueryAllRecruit() {
		System.out.println(recruitDao.queryAllRecruit());
	}
}
