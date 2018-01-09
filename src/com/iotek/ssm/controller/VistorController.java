package com.iotek.ssm.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.iotek.ssm.entity.Admin;
import com.iotek.ssm.entity.Department;
import com.iotek.ssm.entity.Employee;
import com.iotek.ssm.entity.Position;
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
		return "resume";
	}
	
}
