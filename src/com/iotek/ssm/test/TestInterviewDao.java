package com.iotek.ssm.test;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.iotek.ssm.dao.InterviewDao;
import com.iotek.ssm.entity.Interview;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring*.xml")
public class TestInterviewDao {

	@Autowired
	private InterviewDao interviewDao;
	
	@Test
	public void testInsertInterview() {
		System.out.println(interviewDao.insertInterview(new Interview(-1, new Date(), null)));
	}
	
	@Test
	public void testQueryByVistorId() {
		System.out.println(interviewDao.queryByVistorId(1));
	}
	
	@Test
	public void testDeleteInterview() {
		System.out.println(interviewDao.deleteInterview(1));
	}
}
