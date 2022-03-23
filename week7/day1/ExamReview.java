package com.skillstorm.week7.day1;

public class ExamReview {

	public static void main(String[] args) {
		// continue keyword is an indication to go to the top of the loop
		
		for (int i = 0; i < 1000; i++) {
			if (i % 10 !=0) {
//				continue;   //If i is not 10, 20, 30, 100...
				System.out.println(1 + " is not allowed. Breaking out of loop");
				break;
			}
			System.out.println(i);
		}
		System.out.println("Finished loop");
		
		/*
		 * Maps vs Sets
		 * 
		 * Sets:
		 * 1. Ensure unique values and enforced using hashCode and equals
		 * 2.
		 * 3.Remove values with remove()
		 * 4. Unordered collection (Do not maintain indices/position like a queue) (no logical ordering)
		 * 
		 * Maps:
		 * 1. Data stored as key-value pairs
		 * 2. Keys are unique  and enforced with hashCode and equals
		 * 3. Add values with put()
		 * Remove values with remove()
		 * 5. Get values using get(key)
		 * 6. Unordered collection
		 * 
		 */
		
		/*
		 * Stream:
		 * 
		 * Stream is nothing more than a "stream" of data (think like a list), but it's closed
		 */
	}

}
