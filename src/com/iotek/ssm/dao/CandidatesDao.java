package com.iotek.ssm.dao;

import java.util.List;

import com.iotek.ssm.entity.Candidates;

public interface CandidatesDao {

	public Integer insertCandidates(Candidates candidates);//游客发起应聘
	
	public Integer updateCandidates(Candidates candidates);//更新应聘信息的状态
	
	public List<Candidates> queryAllCandidatesByStatus(Integer status);//查询所有的未处理的应聘信息
}
