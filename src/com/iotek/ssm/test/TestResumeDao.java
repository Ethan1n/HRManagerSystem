package com.iotek.ssm.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.iotek.ssm.dao.ResumeDao;
import com.iotek.ssm.entity.Department;
import com.iotek.ssm.entity.Position;
import com.iotek.ssm.entity.Resume;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring*.xml")
public class TestResumeDao {

	@Autowired
	private ResumeDao resumeDao;
	
	@Test
	public void testInsertResume() {
		Resume resume=new Resume(-1, 1, null, "Ů", "24", "˶ʿ", "13917963255", "78954621@163.com", new Department(1, null, null), new Position(1, null, null, null), "3000-4000", "��", "����", "��ͨȺ��", "���");
		System.out.println(resumeDao.insertResume(resume));
	}
	
	@Test
	public void testUpdateResume() {
		Resume resume=new Resume(1, null, null, "��", "26", "����", "13917963255", "78954621@QQ.com", null, null, "4000-5000", "3���ƹ�������", "���", "��Ա", "����Ϸ");
		System.out.println(resumeDao.updateResume(resume));
	}
	
	@Test
	public void testQueryByVistorId() {
		System.out.println(resumeDao.queryByVistorId(1));
	}
}
