package com.example.cab.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.cab.dao.RouteDao;
import com.example.cab.model.Route;

@Repository
public class RouteDaoImpl implements RouteDao{

	@Autowired
	SessionFactory sessionFactory;
	
	@Transactional
	@Override
	public List<Route> getAllRoute() {
		Session session = sessionFactory.getCurrentSession();
		List<Route> routeList = session.createQuery("FROM Route").list();
		return routeList;
	}

	
}
