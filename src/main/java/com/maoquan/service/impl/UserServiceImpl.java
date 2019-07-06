package com.maoquan.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maoquan.bean.User;
import com.maoquan.dao.UserMapper;
import com.maoquan.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper userDao;
	
	@Override
	public User selectUserById(int userId) {
		return userDao.selectByPrimaryKey(userId);
	}

}
