package com.iotek.ssm.dao;

import java.util.List;

import com.iotek.ssm.entity.Candidates;

public interface CandidatesDao {

	public Integer insertCandidates(Candidates candidates);//�οͷ���ӦƸ
	
	public Integer updateCandidates(Candidates candidates);//����ӦƸ��Ϣ��״̬
	
	public List<Candidates> queryAllCandidatesByStatus(Integer status);//��ѯ���е�δ�����ӦƸ��Ϣ
}
