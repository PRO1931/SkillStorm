package com.skillstorm.week4.day4.homework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class IceCreamShop {

	private String name;
	private double amountEarned;
	private ArrayList<IceCream> flavors; 
	private Queue<Customer> customerLine = new LinkedList<>(); 
	
	public IceCreamShop() {
		
	}
	
	public IceCreamShop(String name, ArrayList<IceCream> flavors) {
		this.name = name;
		this.flavors = new ArrayList<>(flavors);
	}
	
	
	public void serviceCustomer() {
		if (customerLine.isEmpty()) {
			throw new IllegalArgumentException("There's no customer in the Queue");
		}
		
		Customer customerBeingServiced = customerLine.poll();
		
		if (customerBeingServiced.getIceCream() == null) {
			throw new IllegalArgumentException("Customer does not have ice cream! Why is customer on line??");
		}
		if (!flavors.contains(customerBeingServiced.getIceCream())) {
			throw new IllegalArgumentException("Flavor not available at this time!");
		}
		amountEarned += customerBeingServiced.getIceCream().getPrice();
	}
	
	
	public void addCustomer(Customer c) {
		if (c == null) {
			throw new IllegalArgumentException("No customer to add to queue!");
		}
		customerLine.add(c);
	}
	
 
	public void addFlavor(IceCream flavor) {
		if (flavor == null) {
			throw new IllegalArgumentException("Flavor not valid");
		}
		if (flavors.contains(flavor)) {
			throw new IllegalArgumentException("Ice cream flavor already exists! No need to add!");
		}
		flavors.add(flavor);
	}
	
	public void removeFlavor(IceCream flavor) {
		if (!flavors.contains(flavor)) {
			throw new IllegalArgumentException("Ice cream flavor not on list");
		}
		flavors.remove(flavor);
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getTotalEarnings() {
		return this.amountEarned;
	}

	@Override
	public String toString() {
		return "IceCreamShop [name=" + name + ", amountEarned=" + amountEarned + ", flavors=" + flavors
				+ ", customerLine=" + customerLine + "]";
	}
	
}