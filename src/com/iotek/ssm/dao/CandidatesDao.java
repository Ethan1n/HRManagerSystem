package com.iotek.ssm.dao;

import java.util.List;

import com.iotek.ssm.entity.Candidates;

public interface CandidatesDao {

	public Integer insertCandidates(Candidates candidates);//�ο�ӦƸ
	
	public Integer updateCandidates(Integer candidatesId);//����ӦƸ��Ϣ��״̬
	
	public List<Candidates> queryAllCandidates();//��ѯ���е�ӦƸ��Ϣ
	
	public Candidates queryCandidatesById(Integer candidatesId);//����ID�鿴ӦƸ��Ϣ
	
	public Candidates queryCandidatesByVisotrId(Integer vistorId);//�����ο�ID�鿴ӦƸ��Ϣ
}
