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

		for(int i = 0; i < numbers.size(); i++) {
			int smallest = i;
			Integer smallestNum = numbers.get(0);
			int smallestNumIndex = 0;
			
			for(int j = i+1; j < numbers.size(); j++) {
				if(numbers.get(j) < numbers.get(smallest)) {
					smallest = j;
				}
			}
			numbers = swap(numbers,i,smallest);
			
		}
		return numbers;
		
	}
	private static List<Integer> swap(List<Integer> data, int first, int second) {
		int temporary = data.get(first);
		data.set(first,data.get(second));
		data.set(second,temporary);
		return data;
	}
	
}
