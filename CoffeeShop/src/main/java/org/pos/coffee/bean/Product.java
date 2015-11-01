package org.pos.coffee.bean;

import java.util.List;

public final class Product extends BaseEntity {

	private String productName;
	private List<Ingredient> ingredientList;
	private List<Ingredient> addOnList;
	private List<ReferenceLookUp> productGroupList;

	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public List<Ingredient> getIngredientList() {
		return ingredientList;
	}
	public void setIngredientList(List<Ingredient> ingredientList) {
		this.ingredientList = ingredientList;
	}
	public List<Ingredient> getAddOnList() {
		return addOnList;
	}
	public void setAddOnList(List<Ingredient> addOnList) {
		this.addOnList = addOnList;
	}
	public List<ReferenceLookUp> getProductGroupList() {
		return productGroupList;
	}
	public void setProductGroupList(List<ReferenceLookUp> productGroupList) {
		this.productGroupList = productGroupList;
	}
	
}
