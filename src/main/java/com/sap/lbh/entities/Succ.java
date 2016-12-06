package com.sap.lbh.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Succ {
	@Id
	private String key;
	private String succId;
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
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
