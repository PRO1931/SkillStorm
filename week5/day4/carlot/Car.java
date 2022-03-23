package com.skillstorm.week5.day4.carlot;

import java.util.Objects;

public class Car {
	
	private String make;
	private String model;
	private int year;
	private int price;
	private String color;
	private int mileage;
	private int seats;
	private boolean used;

	public Car() {
		
	}
	
	public Car(String make, String model, int year, int price) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}
	
	public String getMake() {
		return make;
	}
	
	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String toString() {
		return this.make + " " + this.model + " " + this.year + " " + "$" +  this.price;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(color, make, mileage, model, price, seats, used, year);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(color, other.color) && Objects.equals(make, other.make) && mileage == other.mileage
				&& Objects.equals(model, other.model) && price == other.price && seats == other.seats
				&& used == other.used && year == other.year;
	}
}