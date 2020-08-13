package com.example.cab.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cab.dao.RouteDao;
import com.example.cab.model.Route;
import com.example.cab.service.RouteService;

@Service
public class RouteServiceImpl implements RouteService{

	@Autowired
	RouteDao routeDao;
	
	@Override
	public List<Route> getAllRoute() {
		return routeDao.getAllRoute();
	}

}
