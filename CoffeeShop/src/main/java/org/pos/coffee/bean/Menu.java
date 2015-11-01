package org.pos.coffee.bean;

import java.util.Date;

public class Menu extends BaseEntity {

	private Product product;
	private Meal meal;
	private Double price;
	private Date effectivityDate;
	private Date endDate;

	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Meal getMeal() {
		return meal;
	}
	public void setMeal(Meal meal) {
		this.meal = meal;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Date getEffectivityDate() {
		return effectivityDate;
	}
	public void setEffectivityDate(Date effectivityDate) {
		this.effectivityDate = effectivityDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
}
