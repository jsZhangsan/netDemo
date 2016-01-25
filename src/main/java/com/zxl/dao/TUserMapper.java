package com.zxl.dao;

import org.springframework.stereotype.Repository;

import com.zxl.model.TUser;

@Repository
public interface TUserMapper {
    int deleteByPrimaryKey(String id);

    int insert(TUser record);

    int insertSelective(TUser record);

    TUser selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TUser record);

    int updateByPrimaryKey(TUser record);
}