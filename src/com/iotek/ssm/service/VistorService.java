package com.iotek.ssm.service;

import java.util.List;

import com.iotek.ssm.entity.Candidates;
import com.iotek.ssm.entity.Recruit;
import com.iotek.ssm.entity.Resume;
import com.iotek.ssm.entity.Vistor;

public interface VistorService {

	public Vistor vistorLogin(Vistor vistor);//�ο͵�¼
	
	public Boolean vistorRegister(Vistor vistor);//�ο�ע���˻�
	
	public List<Recruit> findAllRecruit();//�����Ƹ��Ϣ
	
	public Boolean writeResume(Resume resume);//��д��˾����
	
	public Boolean modifyResume(Resume resume);//�޸ļ���
	
	public Resume findResumeByVistorId(Integer vistorId);//�����ο�ID�鿴����
	
	public Boolean sendResume(Candidates candidates);//Ͷ�ݼ���,��ӦƸ�������һ������
	
	//������������
	
	public Boolean modifyVistorPwd(Vistor vistor);//�ο��޸�����
}
