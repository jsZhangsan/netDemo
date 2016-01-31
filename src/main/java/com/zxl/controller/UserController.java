package com.zxl.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zxl.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController extends BaseContorller {

	@Resource
	private UserService userService;
	
	@RequestMapping("/showUser")
	public String showUser(Dto dto, ModelMap modelMap) {
		userService.selUserList(dto.getMap());
		return "showUser";
	}
	
	@RequestMapping("/addUser")
	public String addUser(Dto dto) {
		Map<String, Object> map = dto.getMap();
		userService.addUser(map);
		
		return "redirect:showUser";
	}
}
