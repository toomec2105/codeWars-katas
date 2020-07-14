package important.sort;

import java.util.ArrayList;
import java.util.List;

public class SelectionSort {
	public static List<Integer> selectionSortIterative(final List<Integer> input) {
		if (input.size() == 0 || input.size() == 1) {
			return input;
		}

		List<Integer> numbers = new ArrayList<>(input);

		for (int i = 0; i < numbers.size(); i++) {
			int smallest = i;
			for (int j = i + 1; j < numbers.size(); j++) {
				if (numbers.get(j) < numbers.get(smallest)) {
					smallest = j;
				}
			}
			numbers = swap(numbers, i, smallest);

		}
		return numbers;

	}

	private static List<Integer> swap(List<Integer> data, int first, int second) {

		int temporary = data.get(first);
		data.set(first, data.get(second));
		data.set(second, temporary);
		return data;
	}

	public static List<Integer> selectionSortRecursive(List<Integer> numbers, int begginingOfUnsortedPart) {
		if (numbers.size() == 0 || numbers.size() == 1) {
			
			return numbers;
		}

		if (begginingOfUnsortedPart == numbers.size()) {
			return numbers;
			
		} else {
			int smallestNumIndex = begginingOfUnsortedPart;
			
			for (int j = begginingOfUnsortedPart + 1; j < numbers.size(); j++) {
				
				if (numbers.get(j) < numbers.get(smallestNumIndex)) {
					smallestNumIndex = j;
				}
			}

			swap(numbers, begginingOfUnsortedPart, smallestNumIndex);
			numbers = selectionSortRecursive(numbers, begginingOfUnsortedPart + 1);
		}

		return numbers;

	}
}
