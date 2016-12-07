package com.sap.lbh.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Column;

@Entity
public class FreightOrderRoot {

	@Id
	@Column(name="rootID")
	private String rootID;
	@Column(name="carrierID")
	private String carrierID;
	@Column(name="purchOrg")
	private String purchOrg;
	@Column(name="srcLoc")
	private String srcLoc;
	@Column(name="destLoc")
	private String destLoc;
	
	@OneToMany(mappedBy="freightOrderRoot")
	private Items itemList;
	
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
