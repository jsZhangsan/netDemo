package com.zxl.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zxl.dao.TUserMapper;

@Controller
@RequestMapping("/")
public class UserTestCon extends BaseContorller{
	@Resource
	private TUserMapper tUserMapper;
	
	@RequestMapping("tuu.do")
	public String tu(Dto dto) {
		System.out.println(dto.getMap().get("id"));
		
		return "tu";
	}
}
