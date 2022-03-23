package com.skillstorm.week5.day4.carlot;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Driver {
	
//	
//	Collections.sort(list, new Comparator<String>() {
//	     @Override
//	     public int compare(String o1, String o2) { 
//	         return Collator.getInstance().compare(o1, o2);
//	     }
//	 }
	
	
	
	public static void main(String[] args) {
		CarLot jjMotors = new CarLot();
		//LinkedList<Car> dealerShip = new LinkedList<>();
		Car m330c1 = new Car("BMW", "330", 2002, 20000);
		Car m540c2 = new Car("BMW", "540", 2008, 40000);
		Car m740c3 = new Car("BMW", "740", 2004, 50000);
		Car m440c4 = new Car("BMW", "440", 2020, 60000);
		
		
		
		
//		Collections.sort(dealership -> {
//			
//		};
//		System.out.println("idk");
//		Collections.sort(dealership.getDealership(), (word1, word2) -> {
//			return word1.getPrice() - word2.getPrice();
//		});
		
		jjMotors.addCar(m330c1);
		jjMotors.addCar(m540c2);
		jjMotors.addCar(m740c3);
		jjMotors.addCar(m440c4);
		
		

		YearComparator yearComp = new YearComparator();
		Collections.sort(jjMotors.getDealership(), yearComp);
		System.out.println("Sorting by age");
		System.out.println(jjMotors);
		
		List<Car> filteredCarsByYear = jjMotors.getDealership().stream().filter(car -> car.getYear() == 2021).collect(Collectors.toList());
		System.out.println("Printing filterd cars");
		System.out.println("\n");
		System.out.println(filteredCarsByYear);
		
		System.out.println(m440c4);
//		System.out.println(m330c1);
//		
//		System.out.println(dealership);
//		
//		dealership.sellCar(m540c2);
//		
//		System.out.println(dealership);
		
//		Collections.sort(dealership, new yearComparator());
//		System.out.println("Sorting by iq");
//		System.out.println(dealership);
		
		
		
	}
}