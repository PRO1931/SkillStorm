package com.skillstorm.week5.day4.carlot;

import java.util.Comparator;

public class YearComparator implements Comparator<Car>{
	@Override
	public int compare(Car o1, Car o2) {
		return o1.getYear() - o2.getYear();
	}
	
}