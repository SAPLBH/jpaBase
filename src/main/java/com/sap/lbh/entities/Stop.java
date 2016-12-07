package com.sap.lbh.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Stop {
	@Id
	@Column(name="stopId")
	private String stopId;
	@Column(name="locId")
	private String locId;
	@Column(name="stopCat")
	private String stopCat;
	
	@OneToOne
	@JoinColumn(name="succId")
	private Succ successor;
	
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
	public Succ getSuccessor() {
		return successor;
	}
	public void setSuccessor(Succ successor) {
		this.successor = successor;
	}
	public Stop() {
		super();
	}

}
