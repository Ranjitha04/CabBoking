package com.example.cab.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Route {

	@Id
	private int routeId;
	
	private String source;
	private String destination;
	private double fair;
	


	
	public int getRouteId() {
		return routeId;
	}
	public void setRouteId(int routeId) {
		this.routeId = routeId;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public double getFair() {
		return fair;
	}
	public void setFair(double fair) {
		this.fair = fair;
	}
	
	
}
