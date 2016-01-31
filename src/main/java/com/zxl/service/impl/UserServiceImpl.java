package com.zxl.service.impl;

import java.util.List;
import java.util.Map;

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

	@Override
	public int addUser(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return tUserMapper.addUser(map);
	}

	@Override
	public List<Map<String, Object>> selUserList(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return tUserMapper.selUserList(map);
	}

}
