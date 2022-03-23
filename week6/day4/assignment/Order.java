package com.skillstorm.week6.day4.assignment;

import java.time.LocalTime;

public class Order {
	
	private String customerName;
	private double orderPrice;
	private double deliveryCost;
	private LocalTime orderTime;

	public Order() {
		orderTime = LocalTime.now();
	}

	public Order(String customerName, double orderPrice, double deliveryCost) {
		this();
		this.customerName = customerName;
		this.orderPrice = orderPrice;
		this.deliveryCost = deliveryCost;
		
	}
	public Order(String customerName, double orderPrice, double deliveryCost, LocalTime orderTime) {
		this.customerName = customerName;
		this.orderPrice = orderPrice;
		this.deliveryCost = deliveryCost;
		this.orderTime = orderTime;
		
	}
	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public double getOrderPrice() {
		return orderPrice;
	}

	public void setOrderPrice(double orderPrice) {
		this.orderPrice = orderPrice;
	}

	public double getDeliveryCost() {
		return orderPrice * 0.2;
	}

	public void setDeliveryCost(double deliveryCost) {
		this.deliveryCost = deliveryCost;
	}

	public LocalTime getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(LocalTime orderTime) {
		this.orderTime = orderTime;
	}

	@Override
	public String toString() {
		return "Order [CustomerName= " + customerName + ", Order Price= " + orderPrice + ", Delivery Cost= " + deliveryCost
				+ ", orderTime=" + orderTime + "]";
	}
	
}
