package com.sap.lbh.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class FreightOrderRoot {

	@Id
	private String rootID;
	private String carrierID;
	private String purchOrg;
	private String srcLoc;
	private String destLoc;
	
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
	
	public FreightOrderRoot (){
		super();
	}

}
