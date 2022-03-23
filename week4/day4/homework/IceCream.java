package com.skillstorm.week4.day4.homework;

import java.util.ArrayList;
import java.util.Arrays;

public class IceCream {

	private String flavor;
	private double price;
	
	public IceCream() {
		
	}
	
	public IceCream(String flavor, double price) {
		this.flavor = flavor;
		this.price = price;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}	
		if (!(obj instanceof IceCream)) {
			return false;
		}	
		IceCream other = (IceCream) obj;
		return this.flavor == other.flavor;
	}

	@Override
	public String toString() {
		return "IceCream [flavor= " + flavor + ", price= $" + price + "]";
	}

	public static void main(String[] args) {
		
		IceCream chocolate = new IceCream("Chocolate", 6.00);
		IceCream vanilla = new IceCream("Vanilla", 5.00);
		IceCream strawberry = new IceCream("Strawberry", 7.00);
		
		IceCreamShop dairyQueen = new IceCreamShop("Dairy Queen", new ArrayList<>(Arrays.asList(chocolate, vanilla)));
		dairyQueen.addFlavor(strawberry);
		
		Customer troy = new Customer("Troy", chocolate);
		Customer sean = new Customer("Sean", chocolate);
		Customer fred = new Customer("Fred", strawberry);
		Customer mary = new Customer("Mary", vanilla);
		
		dairyQueen.addCustomer(sean);
		dairyQueen.addCustomer(troy);
		dairyQueen.addCustomer(fred);
		
		IceCream troysIceCream = troy.getIceCream();
		System.out.println("Troy is a new customer wanting chocolate Ice cream, which costs: $" + troysIceCream.getPrice());
		
		System.out.println(dairyQueen +"\n");
		
		dairyQueen.serviceCustomer();
		dairyQueen.serviceCustomer();
		
		System.out.println("After servicing two customers:");
		System.out.println(dairyQueen +"\n");
		
		dairyQueen.addCustomer(mary);
		dairyQueen.addCustomer(sean);
		
		System.out.println("After adding two more customers:");
		System.out.println(dairyQueen + "\n");
		
		dairyQueen.serviceCustomer();
		dairyQueen.serviceCustomer();
		dairyQueen.serviceCustomer();
		
		System.out.println("Shoppe now closed");
		System.out.println(dairyQueen);
		System.out.println("\nTotal earnings for the day: $" + dairyQueen.getTotalEarnings());
	}
}