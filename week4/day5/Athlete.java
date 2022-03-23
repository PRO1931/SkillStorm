 package com.skillstorm.week4.day5;

import java.util.Collections;
import java.util.LinkedList;

public class Athlete implements Comparable<Athlete> {
	
	/*
	 * Implement either Comparable or create Comparator that determines which athlete better based off overall winrate
	 */

	private String name;
	private int careerWins;
	private int careerLosses;
	
	public Athlete() {
		
	}
	
	public Athlete(String name) {
		this.name = name;
	}
	
	public Athlete(String name, int wins, int losses) {
		this.name = name;
		this.careerWins = wins;
		this.careerLosses = losses;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCareerWins() {
		return careerWins;
	}

	public void addWin() {
		this.careerWins++;
	}

	public int getCareerLosses() {
		return careerLosses;
	}

	public void addLoss() {
		this.careerLosses++;
	}
	
	private double calcWinRate() {
		if (careerWins + careerLosses == 0) {
			return 0;
		}
		return ((double) careerWins / (careerWins + careerLosses)) * 100;
	}
	
	@Override
	public String toString() {
		return "[" + this.name + ", " + this.careerWins + " - " + this.careerLosses + "]";
	}

	@Override
	public int compareTo(Athlete other) {
		if (other == null) {
			throw new IllegalArgumentException("Cannot compare Athlete with null");
		}
		if ((this.careerWins + this.careerLosses) < 30 || (other.careerWins + other.careerLosses) < 30) {
			if (this.careerWins == other.careerWins) {
				return other.careerLosses - this.careerLosses;
			}
			return this.careerWins - other.careerWins;
		}
		
		if (this.calcWinRate() == other.calcWinRate()) {
			return other.careerLosses - this.careerLosses;
		} else if (this.calcWinRate() < other.calcWinRate()) {
			return -1;
		} else {
			return 1;
		}
	}
	
	public static void main(String[] args) {
		
		Athlete sean = new Athlete("Sean", 5, 7);
		Athlete james = new Athlete("James", 10, 2);
		Athlete ben = new Athlete("Ben", 12,0);
		Athlete tim = new Athlete("Tim" , 6, 6);
		Athlete steve = new Athlete("Steve", 0, 12);
		Athlete tom = new Athlete("Tom", 100, 0);
		Athlete phil = new Athlete("Phil", 50,49);
		Athlete bear = new Athlete("Bear", 0, 100);
		
		System.out.println(sean);
		sean.addWin(); 
		System.out.println(sean);
		
		System.out.println(phil);
		phil.addLoss();
		System.out.println(phil);
		
		System.out.println(sean.calcWinRate());
		System.out.println(james.calcWinRate());
		System.out.println(ben.calcWinRate());
		System.out.println(tim.calcWinRate());
		System.out.println(steve.calcWinRate());
		System.out.println(phil.calcWinRate());
		System.out.println(bear.calcWinRate());
		System.out.println(tom.calcWinRate());
		
		LinkedList<Athlete> athletes = new LinkedList<>();
		athletes.add(sean);
		athletes.add(james);
		athletes.add(ben);
		athletes.add(tim);
		athletes.add(steve);
		athletes.add(phil);
		athletes.add(bear);
		athletes.add(tom);
		
		System.out.println(athletes);
		Collections.sort(athletes);
		System.out.println(athletes);

	}
}