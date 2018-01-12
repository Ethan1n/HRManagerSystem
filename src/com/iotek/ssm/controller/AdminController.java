package com.iotek.ssm.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.iotek.ssm.entity.Candidates;
import com.iotek.ssm.entity.Department;
import com.iotek.ssm.entity.Interview;
import com.iotek.ssm.entity.Position;
import com.iotek.ssm.entity.Recruit;
import com.iotek.ssm.entity.Resume;
import com.iotek.ssm.service.AdminService;

@RequestMapping("/admin")
@Controller
public class AdminController {

	@Autowired
	private AdminService adminService;
	
	@RequestMapping("/showCandidates")
	public String showCandidates(Model model) {
		List<Candidates> candidateses=adminService.receiveResume();
		model.addAttribute("candidateses", candidateses);
		return "candidatesPage";
	}
	
	@RequestMapping("/showResume")
	public String showResume(Model model, @Param("vistorId") String vistorId, @Param("candidatesId") String candidatesId) {
		Resume resume=adminService.makeMarkToResume(Integer.valueOf(candidatesId), Integer.valueOf(vistorId));
		model.addAttribute("resume", resume);
		model.addAttribute("candidatesId", candidatesId);
		return "showResume";
	}
	
	@RequestMapping("/notifyInterview")
	@ResponseBody
	public String notifyInterview(String interviewDate, Integer candidatesId) {
		Interview interview=new Interview();
		try {
			interview.setInterviewDate(new SimpleDateFormat("yyyy-MM-dd").parse(interviewDate));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		interview.setCandidates(adminService.findCandidatesById(candidatesId));
		Boolean flag=adminService.notifyInterview(interview);
		return String.valueOf(flag);
	}
	
	@RequestMapping("/showRecruit")
	public String showRecruit(Model model) {
		List<Recruit> recruits=adminService.findAllRecruit();
		model.addAttribute("recruits", recruits);
		model.addAttribute("departments", adminService.findAllDepartment());
		model.addAttribute("positions", adminService.findAllPosition());
		return "showRecruit";
	}
	
	@RequestMapping("/deleteRecruit")
	public String deleteRecruit(Integer recruitId) {
		Boolean flag=adminService.removeRecruit(recruitId);
		if(flag) {
			return "redirect:/admin/showRecruit";
		}return null;
	}
	
	@RequestMapping("/toModifyRecruit")
	public String toModifyRecruit(Model model, Integer recruitId) {
		model.addAttribute("recruitId", recruitId);
		model.addAttribute("departments", adminService.findAllDepartment());
		model.addAttribute("positions", adminService.findAllPosition());
		return "modifyRecruit";
	}
	
	@RequestMapping("/modifyRecruit")
	public String modifyRecruit(Recruit recruit, @Param("recruitId") Integer recruitId, @Param("departmentId") Integer departmentId,@Param("positionId") Integer positionId) {
		System.out.println(recruitId);
		System.out.println(departmentId);
		recruit.setRecruitId(recruitId);
		recruit.setDepartment(adminService.findDepartmentById(departmentId));
		recruit.setPosition(adminService.findPositionById(positionId));
		Boolean flag=adminService.modifyRecruit(recruit);
		if(flag) {
			return "redirect:/admin/showRecruit";
		}return null;
	}
	
	@RequestMapping("/insertRecruit")
	public String insertRecruit(Recruit recruit, @Param("departmentId") Integer departmentId,@Param("positionId") Integer positionId) {
		recruit.setDepartment(adminService.findDepartmentById(departmentId));
		recruit.setPosition(adminService.findPositionById(positionId));
		Boolean flag=adminService.addRecruit(recruit);
		if(flag) {
			return "redirect:/admin/showRecruit";
		}return null;
	}
	
	@RequestMapping("/toShowDept")
	public String toShowDept(Model model) {
		model.addAttribute("departments", adminService.findAllDepartment());
		return "showDepartment";
	}
	
	@RequestMapping(value="/showPosition", produces="application/json;charset=utf-8")
	@ResponseBody
	public String showPosition(Model model, Integer departmentId) {
		List<Position> positions=adminService.findAllPositionByDeptId(departmentId);
		Object data=JSON.toJSON(positions);
		return String.valueOf(data);
	}
	
	@RequestMapping("/deleteDept")
	@ResponseBody
	public String deleteDepartment(Integer departmentId) {
		Boolean flag=adminService.removeDepartment(departmentId);
		System.out.println(flag);
		return String.valueOf(flag);
	}
	
	@RequestMapping("/toModifyDept")
	public String toModifyDept(Model model, Integer departmentId) {
		model.addAttribute("departmentId", departmentId);
		return "modifyDept";
	}
	
	@RequestMapping("/modifyDept")
	public String modeifyDept(Department department) {
		Boolean flag=adminService.modifyDepartment(department);
		if(flag) {
			return "redirect:/admin/toShowDept";
		}return null;
	}
	
	@RequestMapping("/addDept")
	public String addDept(String departmentName, String deptcreateTime) {
		Department department=new Department();
		department.setDepartmentName(departmentName);
		try {
			department.setDeptcreateTime(new SimpleDateFormat("yyyy-MM-dd").parse(deptcreateTime));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Boolean flag=adminService.addDepartment(department);
		if(flag) {
			return "redirect:/admin/toShowDept";
		}return null;
	}
	
	@RequestMapping("/deletePosi")
	@ResponseBody
	public String deletePosi(Integer positionId) {
		Boolean flag=adminService.removePosition(positionId);
		return String.valueOf(flag);
	}
	
	@RequestMapping("/addPosi")
	public String addPosi(String positionName, Integer departmentId, String positcreateTime) {
		Position position=new Position();
		position.setPositionName(positionName);
		try {
			position.setPosicreateTime(new SimpleDateFormat("yyyy-MM-dd").parse(positcreateTime));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		position.setDepartment(adminService.findDepartmentById(departmentId));
		Boolean flag=adminService.addPosition(position);
		System.out.println(flag);
		if(flag) {
			return "redirect:/admin/toShowDept";
		}return null;
	}
}
