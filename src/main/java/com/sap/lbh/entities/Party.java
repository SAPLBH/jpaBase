package com.sap.lbh.entities;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Column;

@Entity
public class Party {
	
	@Id
	@Column(name="partyId")
	private String partyId;
	@Column(name="partyName")
	private String partyName;
	@Column(name="address1")
	private String address1;
	@Column(name="address2")
	private String address2;
	
	private FreightOrderRoot execOrder;
	public String getPartyId() {
		return partyId;
	}
	public void setPartyId(String partyId) {
		this.partyId = partyId;
	}
	public String getPartyName() {
		return partyName;
	}
	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public Party() {
		super();
	}
	
}
