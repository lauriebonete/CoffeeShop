package org.pos.coffee.bean;

public class Item extends BaseEntity {

	private String itemName;
	private String description;
	private ReferenceLookUp uom;
	
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public ReferenceLookUp getUom() {
		return uom;
	}
	public void setUom(ReferenceLookUp uom) {
		this.uom = uom;
	}
	
	
}
