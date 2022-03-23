package com.skillstorm.week6.day2;

public class EnumPractice {

	public static boolean compareTwoColors(Color color1, Color color2) {
		return color1 == color2;
	}
	
	public static String getHexCode(Color color) {
		// Let's use a switch statement to return hexcode depending on the color
		switch (color) {
		case RED:
			return "#FF0000";  // hexcode for RED
		case ORANGE:
			return "#FFA500";  // hexcode for ORANGE
		case YELLOW:
			return "#FFFF00";  // hexcode for YELLOW
		case GREEN:
			return "#008000";  // hexcode for GREEN
		case BLUE:
			return "#0000FF";  // hexcode for BLUE
		case INDIGO:
			return "#4B0082";  // hexcode for INDIGO
		case VIOLET:
			return "#EE82EE";  // hexcode for VIOLET
		default:
			return "#000000";  // hexcode for BLACK
		}
	}
	
	public static void determineDailyPlans(Weather weather) {
		// No data sanitization needed
		if (weather == null) {
			throw new IllegalArgumentException("No weather provided");
		}
		switch (weather) {
			case RAINY:
				System.out.println("I will put on a movie today");
				break;
			case SUNNY:
			case PARTLY_CLOUDY:
				System.out.println("I will go to the beach today");
				break;
			case SNOWY:
				System.out.println("I will go skiing today");
				break;
			default:
				System.out.println("I will play it by ear");
		}
		System.out.println("\nFinished Switch statement\n");
	}
	

	public static void main(String[] args) {
		System.out.println(Color.RED);
		
		System.out.println("Do the two colors equal?" + compareTwoColors(Color.RED, Color.GREEN));
	}

}
