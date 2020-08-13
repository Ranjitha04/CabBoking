package com.example.cab.dao.impl;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.cab.dao.UserDao;
import com.example.cab.model.User;

@Repository
public class UserDaoImpl implements UserDao{

	@Autowired
	SessionFactory SessionFactory;
	
	@Transactional
	@Override
	public void saveUser(User user) {
		Session session = SessionFactory.getCurrentSession();
		session.save(user);
	}

	@Transactional
	@Override
	public boolean authenticateUser(String username, String password) {
		//String query = "select * from UserTable where name='" + username +  "' and password=" + password;
		Session session = SessionFactory.getCurrentSession();
		SQLQuery query =  session.createSQLQuery("select * from UserTable where userName=? and password=?");
		query.setParameter(0, username);
		query.setParameter(1, password);
		List result = query.list();
		if(result.size() > 0) return true;
		return false;
	}
	
}
