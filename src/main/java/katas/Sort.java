package katas;

import java.util.ArrayList;
import java.util.List;

public class Sort {
	public static List<Integer> insertionSort(final List<Integer> input) {
		if (input.size() == 0 || input.size() == 1) {
			return input;
		}
		
		List<Integer> numbers = new ArrayList<>(input);

		for (int i = 1; i < numbers.size(); i++) {
			
			int current = numbers.get(i);
			
			for (int j = i; j > 0; j--) {
				int previous = numbers.get(j - 1);
				
				if (current < previous) {
					
					numbers.set(j, previous); 
					numbers.set(j-1, current);
				}else {
					break;
				}
			}
			
			
			/*
			 * if (current < previous) {
			 * 
			 * numbers.set(i, previous); numbers.set(i - 1, current); i = i > 1 ? i - 2 : 0;
			 * }
			 */
		}

		return numbers;

	}
	
	public static List<Integer> selectionSort(final List<Integer> input) {
		if (input.size() == 0 || input.size() == 1) {
			return input;
		}
		
		List<Integer> numbers = new ArrayList<>(input);
		List<Integer> output = new ArrayList<>();

		while(numbers.size() > 0) {
			
			Integer smallestNum = numbers.get(0);
			int smallestNumIndex = 0;
			
			for(int j = 0; j < numbers.size(); j++) {
				smallestNum = numbers.get(j) <= smallestNum ? numbers.get(j) : smallestNum;
				smallestNumIndex = numbers.get(j) <= smallestNum ? j : smallestNumIndex;
			}
			
			output.add(smallestNum);
			numbers.remove(smallestNumIndex);
		}
		return output;
		
	}
	
	
}
