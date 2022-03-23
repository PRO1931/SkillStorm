package com.skillstorm.week6.day3.assignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Scanner;

public class FileWordCount {
	
	public static void readFileUsingScanner(String filePath) {
		try (Scanner scanner = new Scanner(new File(filePath))) {
			while (scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}
		} catch (FileNotFoundException e) {
				e.printStackTrace();
		}
	}
	
	public static HashMap<String, Integer> wordCounter(String input) {
		HashMap<String, Integer> freqMap = new HashMap<>();
		
		
		String newString = input.replaceAll("[^\\w\\s]", "");
		String[] words = newString.split(" ");
		
		for (String word : words) {
			
			word = word.trim().toLowerCase();
			
			if (freqMap.get(word) == null) {
				freqMap.put(word, freqMap.get(word) + 1);
								
			} else {
				freqMap.put(word, 1);
				
			}
		}
		
		return freqMap;
	}

	public static void main(String[] args) {
		String sampleFilePath = System.getProperty("user.home") + "//VET TEC//Trainings//src//sampleText.txt";
//		readFileUsingBR(sampleFilePath);
		readFileUsingScanner(sampleFilePath);
		wordCounter(sampleFilePath);
	}

}
