package org.pos.coffee.bean;

import java.util.Date;
import java.util.List;

public class Sale extends BaseEntity {

	private List<Order> orders;
	private MaestroUser server;
	private ReferenceLookUp branch;
	private Date saleDate;
	private Double totalSale;
	private Double totalCost;
	private Double totalDiscount;
	private Double totalSurcharge;
	private Customer customer;

	public List<Order> getOrders() {
		return orders;
	}
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	public MaestroUser getServer() {
		return server;
	}
	public void setServer(MaestroUser server) {
		this.server = server;
	}
	public ReferenceLookUp getBranch() {
		return branch;
	}
	public void setBranch(ReferenceLookUp branch) {
		this.branch = branch;
	}
	public Date getSaleDate() {
		return saleDate;
	}
	public void setSaleDate(Date saleDate) {
		this.saleDate = saleDate;
	}
	public Double getTotalSale() {
		return totalSale;
	}
	public void setTotalSale(Double totalSale) {
		this.totalSale = totalSale;
	}
	public Double getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(Double totalCost) {
		this.totalCost = totalCost;
	}
	public Double getTotalDiscount() {
		return totalDiscount;
	}
	public void setTotalDiscount(Double totalDiscount) {
		this.totalDiscount = totalDiscount;
	}
	public Double getTotalSurcharge() {
		return totalSurcharge;
	}
	public void setTotalSurcharge(Double totalSurcharge) {
		this.totalSurcharge = totalSurcharge;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
}
