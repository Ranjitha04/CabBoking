package com.example.cab.dao;

import com.example.cab.model.User;

public interface UserDao {

	void saveUser(User user);

	boolean authenticateUser(String username, String password);

}
