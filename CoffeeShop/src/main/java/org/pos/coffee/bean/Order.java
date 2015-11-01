package org.pos.coffee.bean;

public class Order extends BaseEntity {

	private Sale sale;
	private Product product;
	private Meal meal;
	private Double quantity;
	private Double totalLinePrice;
	private Double totalLineExpense;

	public Sale getSale() {
		return sale;
	}
	public void setSale(Sale sale) {
		this.sale = sale;
	}
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
	public Double getQuantity() {
		return quantity;
	}
	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}
	public Double getTotalLinePrice() {
		return totalLinePrice;
	}
	public void setTotalLinePrice(Double totalLinePrice) {
		this.totalLinePrice = totalLinePrice;
	}
	public Double getTotalLineExpense() {
		return totalLineExpense;
	}
	public void setTotalLineExpense(Double totalLineExpense) {
		this.totalLineExpense = totalLineExpense;
	}
	
}
