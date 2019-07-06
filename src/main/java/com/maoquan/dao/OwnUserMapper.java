package com.maoquan.dao;

import com.maoquan.bean.OwnUser;

public interface OwnUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OwnUser record);

    int insertSelective(OwnUser record);

    OwnUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OwnUser record);

    int updateByPrimaryKey(OwnUser record);
}