package org.pos.coffee.bean;

public class ReferenceLookUp extends BaseEntity {

	private String category;
	private String key;
	private String value;
	private Integer numberValue;
	private ReferenceLookUp parentLookUp;
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public Integer getNumberValue() {
		return numberValue;
	}
	public void setNumberValue(Integer numberValue) {
		this.numberValue = numberValue;
	}
	public ReferenceLookUp getParentLookUp() {
		return parentLookUp;
	}
	public void setParentLookUp(ReferenceLookUp parentLookUp) {
		this.parentLookUp = parentLookUp;
	}
	
}
