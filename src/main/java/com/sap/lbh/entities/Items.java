package com.sap.lbh.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Items {
	@Id
	@Column(name="itemID")
	private String itemID;
	@Column(name="itemType")
	private String itemType;
	@Column(name="itemIdentifier")
	private String itemIdentifier;
	@Column(name="qty")
	private String qty;
	@Column(name="weight")
	private String weight;
	
	@ManyToOne
	@JoinColumn(name="rootKey")
	private FreightOrderRoot freightOrderRoot;
	
	public String getItemID() {
		return itemID;
	}
	public void setItemID(String itemID) {
		this.itemID = itemID;
	}
	public String getItemType() {
		return itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}
	public String getItemIdentifier() {
		return itemIdentifier;
	}
	public void setItemIdentifier(String itemIdentifier) {
		this.itemIdentifier = itemIdentifier;
	}
	public String getQty() {
		return qty;
	}
	public void setQty(String qty) {
		this.qty = qty;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	
	public Items() {
		super();
	}


}
