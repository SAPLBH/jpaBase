package com.sap.lbh.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import java.util.Collection;

import javax.persistence.Column;

@Entity
public class FreightOrderRoot {

	@Id
	@Column(name="rootID")
	private String rootID;
	@Column(name="freightOrderType")
	private String freightOrderType;
	@Column(name="carrierID")
	private String carrierID;
	@Column(name="purchOrg")
	private String purchOrg;
	@Column(name="srcLoc")
	private String srcLoc;
	@Column(name="destLoc")
	private String destLoc;
	@OneToMany(mappedBy="root", targetEntity=Stop.class)
	private Collection stop;
	
	@OneToMany(mappedBy="freightOrderRoot", targetEntity=Items.class)
	private Collection itemList;
	
	@OneToMany(mappedBy="execOrder", targetEntity=Party.class)
	private Collection carrier;
	
public String getRootID() {
		return rootID;
	}
	public void setRootID(String rootID) {
		this.rootID = rootID;
	}
	public String getCarrierID() {
		return carrierID;
	}
	public void setCarrierID(String carrierID) {
		this.carrierID = carrierID;
	}
	public String getPurchOrg() {
		return purchOrg;
	}
	public void setPurchOrg(String purchOrg) {
		this.purchOrg = purchOrg;
	}
	public String getSrcLoc() {
		return srcLoc;
	}
	public void setSrcLoc(String srcLoc) {
		this.srcLoc = srcLoc;
	}
	public String getDestLoc() {
		return destLoc;
	}
	public void setDestLoc(String destLoc) {
		this.destLoc = destLoc;
	}
	
	public String getFreightOrderType() {
		return freightOrderType;
	}
	public void setFreightOrderType(String freightOrderType) {
		this.freightOrderType = freightOrderType;
	}
	public Collection getStop() {
		return stop;
	}
	public void setStop(Collection stop) {
		this.stop = stop;
	}
	public Collection getItemList() {
		return itemList;
	}
	public void setItemList(Collection itemList) {
		this.itemList = itemList;
	}
	public Collection getCarrier() {
		return carrier;
	}
	public void setCarrier(Collection carrier) {
		this.carrier = carrier;
	}
	public FreightOrderRoot (){
		super();
	}

}
