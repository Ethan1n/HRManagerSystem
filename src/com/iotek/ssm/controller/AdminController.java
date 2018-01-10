package com.iotek.ssm.controller;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.iotek.ssm.entity.Candidates;
import com.iotek.ssm.entity.Resume;
import com.iotek.ssm.service.AdminService;

@RequestMapping("/admin")
@Controller
public class AdminController {

	@Autowired
	private AdminService adminService;
	
	@RequestMapping("/showCandidates")
	public String showCandidates(Model model) {
		List<Candidates> candidateses=adminService.receiveResume(0);
		model.addAttribute("candidateses", candidateses);
		return "candidatesPage";
	}
	
	@RequestMapping("/showResume")
	public String showResume(Model model, @Param("vistorId") String vistorId, @Param("candidatesId") String candidatesId) {
		Resume resume=adminService.makeMarkToResume(Integer.valueOf(candidatesId), Integer.valueOf(vistorId));
		model.addAttribute("resume", resume);
		return "showResume";
	}
}
