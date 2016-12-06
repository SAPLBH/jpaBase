package com.sap.lbh.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Succ {
	@Id
	private String id;
	private String succId;
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
	public Succ() {
		super();
	}
	
}
