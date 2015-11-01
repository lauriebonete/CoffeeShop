package org.pos.coffee.bean;

public class Ingredient extends BaseEntity {

	private Item item;
	private Double quantity;
	
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public Double getQuantity() {
		return quantity;
	}
	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}
	
}
