package com.zxl.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zxl.dao.TUserMapper;
import com.zxl.model.TUser;
import com.zxl.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	
	@Resource
	private TUserMapper tUserMapper;

	public TUser selUser(String id) {
		// TODO Auto-generated method stub
		return tUserMapper.selectByPrimaryKey(id);
	}

}
