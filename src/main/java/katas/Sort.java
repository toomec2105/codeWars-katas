package katas;

import java.util.List;

public class Sort {
	public static List<Integer> sort(final List<Integer> input) {
		if (input.size() == 0 || input.size() == 1) {
			return input;
		}
		
		List<Integer> numbers = input;

		for (int i = 1; i < numbers.size(); i++) {
			
			int current = numbers.get(i);
			int previous = numbers.get(i - 1);
			
			
			if (current < previous) {
				
				numbers.set(i, previous);
				numbers.set(i - 1, current);
				i = i > 1 ? i - 2 : 0;
			}
		}

		return numbers;

	}
}
