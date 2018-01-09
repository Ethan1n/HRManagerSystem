package com.iotek.ssm.test;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.iotek.ssm.dao.CandidatesDao;
import com.iotek.ssm.entity.Candidates;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring*.xml")
public class TestCandidatesDao {

	@Autowired
	private CandidatesDao candidatesDao;
	
	@Test
	public void testInsertCandidates() {
		Candidates candidates=new Candidates();
		candidates.setVistorId(1);
		candidates.setDeliveryTime(new Date());
		candidates.setStatus(0);
		System.out.println(candidatesDao.insertCandidates(candidates));
	}
	
	@Test
	public void testUpdateCandidates() {
		Candidates candidates=new Candidates();
		candidates.setCandidatesId(1);
		candidates.setStatus(1);
		System.out.println(candidatesDao.updateCandidates(candidates));
	}
	
	@Test
	public void testQueryAllCandidatesByStatus() {
		System.out.println(candidatesDao.queryAllCandidatesByStatus(1));
	}
}
