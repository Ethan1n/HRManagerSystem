package com.iotek.ssm.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.iotek.ssm.entity.Admin;
import com.iotek.ssm.entity.Candidates;
import com.iotek.ssm.entity.Department;
import com.iotek.ssm.entity.Employee;
import com.iotek.ssm.entity.Interview;
import com.iotek.ssm.entity.Position;
import com.iotek.ssm.entity.Recruit;
import com.iotek.ssm.entity.Resume;
import com.iotek.ssm.entity.Vistor;
import com.iotek.ssm.service.AdminService;
import com.iotek.ssm.service.EmployeeService;
import com.iotek.ssm.service.VistorService;

@RequestMapping("/vistor")
@Controller
public class VistorController {

	@Autowired
	private VistorService vistorService;
	@Autowired
	private EmployeeService employeeService;
	@Autowired
	private AdminService adminService;
	
	@RequestMapping("/toRegister")
	public String toRegister() {
		return "register";
	}
	
	@RequestMapping("/register")
	public String register(Vistor vistor) {
		Boolean flag=vistorService.vistorRegister(vistor);
		if(flag) {
			return "redirect:/vistor/toLogin";
		}else {
			return "/error/registerFail";
		}
	}
	
	@RequestMapping("/toLogin")
	public String toLogin() {
		return "login";
	}
	
	@RequestMapping("/login")
	public String vistorLogin(Model model, @RequestParam("name") String name, @RequestParam("password") String password, @RequestParam("loginType") String loginType) {
		if(loginType.equals("1")) {
			Vistor vistor=vistorService.vistorLogin(new Vistor(name, password));
			if(vistor!=null) {
				model.addAttribute("candidates", vistorService.findCandidatesByVisotrId(vistor.getVistorId()));
				model.addAttribute("interview", vistorService.receiveInterview(vistor.getVistorId()));
				model.addAttribute("vistor", vistor);
				return "vistorPage";
			}else {
				return "/error/noPerson";
			}
		}else if(loginType.equals("2")) {
			Employee employee=employeeService.employeeLogin(new Employee(name, password));
			if(employee!=null) {
				model.addAttribute("employee", employee);
				return "employeePage";
			}else {
				return "/error/noPerson";
			}
		}else if(loginType.equals("3")) {
			Admin admin=adminService.adminLogin(new Admin(name, password));
			if(admin!=null) {
				model.addAttribute("departments", adminService.findAllDepartment());
				model.addAttribute("admin", admin);
				return "adminPage";
			}else {
				return "/error/noPerson";
			}
		}
		return null;
	}
	
	@RequestMapping("/showResume")
	public String showResume(Model model, String vistorId) {
		Resume resume=vistorService.findResumeByVistorId(Integer.valueOf(vistorId));
		List<Department> departments=adminService.findAllDepartment();
		List<Position> positions=adminService.findAllPosition();
		model.addAttribute("departments", departments);
		model.addAttribute("positions", positions);
		model.addAttribute("resume", resume);
		model.addAttribute("vistorId", vistorId);
		return "resume";
	}
	
	@RequestMapping("/writeResume")
	public String writeResume(Resume resume, @RequestParam("departmentId") String departmentId, @RequestParam("positionId") String positionId) {
		Department department=adminService.findDepartmentById(Integer.valueOf(departmentId));
		Position position=adminService.findPositionById(Integer.valueOf(positionId));
		resume.setApplyDepartment(department);
		resume.setApplyPosition(position);
		Boolean flag=vistorService.writeResume(resume);
		if(flag) {
			return "redirect:/vistor/showResume?vistorId="+resume.getVistorId();
		}else {
			return null;
		}
	}
	
	@RequestMapping("/modifyResume")
	public String modifyResume(Resume resume) {
		Boolean flag=vistorService.modifyResume(resume);
		System.out.println(flag);
		if(flag) {
			return "redirect:/vistor/showResume?vistorId="+resume.getVistorId();
		}else {
			return null;
		}
	}
	
	@RequestMapping("/modifyPwd")
	public String modifyPwd(Vistor vistor) {
		Boolean flag=vistorService.modifyVistorPwd(vistor);
		if(flag) {
			return "redirect:/vistor/toLogin";
		}else {
			return null;
		}
	}
	
	@RequestMapping("/showRecruit")
	public String showRecruit(Model model, String vistorId) {
		List<Recruit> recruits=vistorService.findAllRecruit();
		model.addAttribute("recruits", recruits);
		model.addAttribute("vistorId", vistorId);
		System.out.println(vistorId);
		return "recruitPage";
	}
	
	@RequestMapping("/sendResume")
	@ResponseBody
	public String sendResume(Candidates candidates) {
		Boolean flag=vistorService.sendResume(candidates);
		return String.valueOf(flag);
	}
	
	@RequestMapping("/receiveInterview")
	@ResponseBody
	public String receiveInterview(String vistorId) {
		Interview interview=vistorService.receiveInterview(Integer.valueOf(vistorId));
		Boolean flag=interview!=null?true:false;
		return String.valueOf(flag);
	}
}
