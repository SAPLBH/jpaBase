package com.sap.lbh.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Succ {
	@Id
	@Column(name="id")
	private String id;
	@Column(name="succId")
	private String succId;
	@OneToOne(mappedBy = "successor")
	private Stop stop;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSuccId() {
		return succId;
	}
	public void setSuccId(String succId) {
		this.succId = succId;
	}
	public Stop getStop() {
		return stop;
	}
	public void setStop(Stop stop) {
		this.stop = stop;
	}
	public Succ() {
		super();
	}
	
}
