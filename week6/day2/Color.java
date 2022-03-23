package com.skillstorm.week6.day2;

/*
 * What is an enum?
 * 
 * it stands for enumeration...Treat it as a list of constant values
 * 
 * Pros:
 * 1. Gives a constant data set to work with
 * 2. Since it's a constant value, compating to an enum is much quicker than string comparisons
 * 3. They're static, so I can compare with ==freely because they are at the same location in memory wherever I use it
 * 4. Adds a level of type checking to our comparisons (Color.RED is not the same as Car.RED)
 * 
 * 1 == 1 -> RED == RED
 * "red".equals("red") -> I must loop through both strings, comparing character by character
 * 
 * Enums compared to strings, limit what is actually allowed
 */
public enum Color {
		RED,
		ORANGE,
		YELLOW,
		GREEN,
		BLUE,
		INDIGO,
		VIOLET,
		BLACK

}
