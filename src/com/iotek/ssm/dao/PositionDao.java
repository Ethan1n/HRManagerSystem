package com.iotek.ssm.dao;

import java.util.List;

import com.iotek.ssm.entity.Position;

public interface PositionDao {

	public Integer insertPosition(Position position);//���ְλ
	
	public Integer deletePosition(Integer positionId);//ɾ��ְλ
	
	public Integer updatePosition(Position position);//����ְλ
	
	public List<Position> queryAllPosition();//�鿴����ְλ
	
	public Position queryPositionById(Integer positionId);//����ID�鿴ְλ
	
	public List<Position> queryByDepartmentId(Integer departmentId);//���ݲ���ID��ѯְλ
	
}
