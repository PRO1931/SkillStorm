package com.skillstorm.week3.day5;

import java.util.ArrayList;

public class Programmer {

	private String name;
	private String company;
	private ArrayList<String> programmingLanguages;
	
	// Insert Constructors here
	public Programmer() {
		
	}
	
	
	public Programmer(String name, String company, ArrayList<String> programmingLanguages) {
		this.name = name;
		this.company = company;
		this.programmingLanguages = programmingLanguages;
	}


	// Insert getters/setters here
	
	// Should also prevent null values from being added
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	public ArrayList<String> getProgrammingLanguages() {
		return programmingLanguages;
	}


	public void setProgrammingLanguages(ArrayList<String> programmingLanguages) {
		this.programmingLanguages = programmingLanguages;
	}

	public void learnLanguage(String programmingLanguage) {
		// "Learns" or adds the programming language to the list
	}
	
	public void forgetLanguage(String programmingLanguage) {
		// "Forgets" or removes the programming language to the list
	}
}