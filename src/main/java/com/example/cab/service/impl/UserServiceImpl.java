package com.example.cab.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cab.dao.UserDao;
import com.example.cab.helper.UserHelper;
import com.example.cab.model.User;
import com.example.cab.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserDao userDao;
	
	
	@Override
	public void saveUser(User user) {
		userDao.saveUser(user);
	}


	@Override
	public boolean authenticateUser(String username, String password) {
		return userDao.authenticateUser(username, password);
	}

}
