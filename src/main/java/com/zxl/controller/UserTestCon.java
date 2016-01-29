package com.zxl.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zxl.dao.TUserMapper;

@Controller
@RequestMapping("/")
public class UserTestCon {
	@Resource
	private TUserMapper tUserMapper;
	
	@RequestMapping("/tu")
	public String tu(HttpServletRequest request,Model model) {
		String id = request.getParameter("id");
		System.out.println(tUserMapper.selectByPrimaryKey(id));
		
		return "tu";
	}
}
