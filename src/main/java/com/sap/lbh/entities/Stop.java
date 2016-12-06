package com.sap.lbh.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Stop {
	@Id
	private String stopId;
	private String locId;
	private String stopCat;
	
	public String getStopId() {
		return stopId;
	}
	public void setStopId(String stopId) {
		this.stopId = stopId;
	}
	public String getLocId() {
		return locId;
	}
	public void setLocId(String locId) {
		this.locId = locId;
	}
	public String getStopCat() {
		return stopCat;
	}
	public void setStopCat(String stopCat) {
		this.stopCat = stopCat;
	}
	public Stop() {
		super();
	}

}
