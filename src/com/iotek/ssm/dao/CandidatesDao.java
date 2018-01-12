package com.iotek.ssm.dao;

import java.util.List;

import com.iotek.ssm.entity.Candidates;

public interface CandidatesDao {

	public Integer insertCandidates(Candidates candidates);//游客应聘
	
	public Integer updateCandidates(Integer candidatesId);//更新应聘信息的状态
	
	public List<Candidates> queryAllCandidates();//查询所有的应聘信息
	
	public Candidates queryCandidatesById(Integer candidatesId);//根据ID查看应聘信息
	
	public Candidates queryCandidatesByVisotrId(Integer vistorId);//根据游客ID查看应聘信息
}
