package com.skillstorm.week5.day4.carlot;

import java.util.LinkedList;

public class CarLot {
	
	//private Car car;
	private LinkedList<Car> dealership = new LinkedList<>();
	//private LinkedList<Customer> customerLine = new LinkedList<>();
	
	public CarLot() {
	}
	
	public CarLot(LinkedList<Car> dealership) {
		this.dealership = dealership;
	}
	
	//	public Car getCar() {
	//		return car;
	//	}
	//
	//	public void setCar(Car car) {
	//		this.car = car;
	//	}
	
public LinkedList<Car> getDealership() {
		return dealership;
	}

	public void setDealership(LinkedList<Car> dealership) {
		this.dealership = dealership;
	}
	
	public void addCar(Car car) {
		dealership.add(car);
	}
	
	public void sellCar(Car car) {
		
		if(!dealership.contains(car)) {
			throw new IllegalArgumentException("We do not have this car at this dealership, please choose another");
		}else {
			System.out.println("Congrats on your new car");
			dealership.remove(car);
		}
	}
	
	
	public static void sorts(int year) {
		
	}
	
	public void sortByYear(int year) {
		
		int newestYear = 2022;
		for(int i = 2000; i < newestYear; i++) 
		//Collections.sort(dealership);
			
		if(dealership.contains(getDealership())) {
			
		}
		
	}	
	
	@Override
	public String toString() {
		return "dealerships current inventory: " + dealership;
	}
}