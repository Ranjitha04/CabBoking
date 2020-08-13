package com.example.cab.service;

import com.example.cab.model.User;

public interface UserService {

	void saveUser(User user);

	boolean authenticateUser(String username, String password);

}
