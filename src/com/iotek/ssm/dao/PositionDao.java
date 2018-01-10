package com.iotek.ssm.dao;

import java.util.List;

import com.iotek.ssm.entity.Position;

public interface PositionDao {

	public Integer insertPosition(Position position);//添加职位
	
	public Integer deletePosition(Integer positionId);//删除职位
	
	public Integer updatePosition(Position position);//更新职位
	
	public List<Position> queryAllPosition();//查看所有职位
	
	public Position queryPositionById(Integer positionId);//根据ID查看职位
	
	public List<Position> queryByDepartmentId(Integer departmentId);//根据部门ID查询职位
	
}
