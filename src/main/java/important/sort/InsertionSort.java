package important.sort;

import java.util.ArrayList;
import java.util.List;

public class InsertionSort {
	public static List<Integer> insertionSortInterative(final List<Integer> input) {
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
					numbers.set(j - 1, current);
				} else {
					break;
				}
			}

		}

		return numbers;

	}

	public static List<Integer> insertionSortRecursive(List<Integer> numbers, int begginingOfUnsortedPart) {
		if (numbers.size() == 0 || numbers.size() == 1) {
			return numbers;
		}

		if (begginingOfUnsortedPart == numbers.size()) {
			return numbers;
			
		} else {
			int current = numbers.get(begginingOfUnsortedPart);

			for (int j = begginingOfUnsortedPart; j > 0; j--) {
				int previous = numbers.get(j - 1);

				if (current < previous) {

					numbers.set(j, previous);
					numbers.set(j - 1, current);
				} else {
					break;
				}
			}

			insertionSortRecursive(numbers, begginingOfUnsortedPart + 1);
		}

		return numbers;

	}
}
