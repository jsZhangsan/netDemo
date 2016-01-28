package com.zxl.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zxl.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Resource
	private UserService userService;
	
	@RequestMapping("/showUser")
	public String showUser(HttpServletRequest request,Model model) {
		String id = request.getParameter("id");
		System.out.println(userService.selUser(id));
		return "showUser";
	}
}
