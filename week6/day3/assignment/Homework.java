package com.skillstorm.week6.day3.assignment;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;


public class Homework {
	
	public static HashMap<String, Integer> wordCounter(String filePath) {
		HashMap<String, Integer> freqMap = new HashMap<>();
		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
			String line = reader.readLine();
			while (line != null) {
				String[] words = line.replaceAll("[^\\w\\s]", "").split(" ");
				for (String word : words) {
					word = word.trim().toLowerCase();
					if (freqMap.get(word) == null) {
						freqMap.put(word, 1);
					} else {
						freqMap.put(word, freqMap.get(word) + 1);
					}
				}
				line = reader.readLine();
			}
		} catch (FileNotFoundException e) {
			System.err.println("File: " + filePath + "  is not found on this path!");
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println("File is corrupt!!");
			e.printStackTrace();
		}
		return freqMap;
	}
	
	public static void main(String[] args) {
		String sampleText = System.getProperty("user.home")	+ "//VET TEC//Trainings//src//sampleText.txt";
		//String samplePath = "C:/Users/PRO1931/Downloads/sampleText.txt";
		System.out.println(wordCounter(sampleText));
		
		String longFile = System.getProperty("user.home")	+ "//VET TEC//Trainings//src//longFile.txt";
		//String longFile = "C:/Users/PRO1931/Downloads/longFile.txt";
		System.out.println(wordCounter(longFile));
		
		String beeMovie = System.getProperty("user.home")	+ "//VET TEC//Trainings//src//beeMovie.txt";
		//String samplePath = "C:/Users/PRO1931/Downloads/beeMovie.txt";
		System.out.println(wordCounter(beeMovie));
		
	}	
}