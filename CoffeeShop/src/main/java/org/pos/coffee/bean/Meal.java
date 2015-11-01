package org.pos.coffee.bean;

import java.util.List;

public class Meal extends BaseEntity {

	private String mealName;
	private List<ProductMeal> productMealList;
	private Boolean isCustomizable;

	public String getMealName() {
		return mealName;
	}
	public void setMealName(String mealName) {
		this.mealName = mealName;
	}
	public List<ProductMeal> getProductMealList() {
		return productMealList;
	}
	public void setProductMealList(List<ProductMeal> productMealList) {
		this.productMealList = productMealList;
	}
	public Boolean getIsCustomizable() {
		return isCustomizable;
	}
	public void setIsCustomizable(Boolean isCustomizable) {
		this.isCustomizable = isCustomizable;
	}
	
}
