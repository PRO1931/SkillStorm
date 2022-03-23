package com.skillstorm.week2.day5;

public class Square extends Shape {

	private double length;
	
	public Square(double length) {
		this.length = length;
	}
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return this.length * this.length;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Square";
	}
}