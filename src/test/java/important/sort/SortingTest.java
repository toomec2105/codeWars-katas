package important.sort;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import important.sort.InsertionSort;
import important.sort.SelectionSort;

class SortingTest {
	@Test
	void givenEmptyList_returnsEmptyList() {
		assertEquals(Arrays.asList(), InsertionSort.insertionSortInterative(Arrays.asList()));
	}

	@Test
	void givenOneElement_sortsCorrectly() {
		assertEquals(Arrays.asList(8), InsertionSort.insertionSortInterative(Arrays.asList(8)));
	}

	@Test
	void givenTwoElements_sortsCorrectly() {
		assertEquals(Arrays.asList(2, 6), InsertionSort.insertionSortInterative(Arrays.asList(6, 2)));
	}

	@Test
	void givenMultipleElements_sortsCorrectly() {
		assertEquals(Arrays.asList(-7, -5, 1, 2, 3, 4, 6, 8),
				InsertionSort.insertionSortInterative(Arrays.asList(8, 2, -5, 1, -7, 6, 3, 4)));
	}

	@Test
	void givenMultipleElementsWithDuplicates_sortsCorrectly() {
		assertEquals(Arrays.asList(-4, 5, 8, 8, 11, 11),
				InsertionSort.insertionSortInterative(Arrays.asList(8, 8, 5, 11, -4, 11)));
	}

	@Test
	void givenTwoElementsWithDuplicates_sortsCorrectly() {
		assertEquals(Arrays.asList(2, 2), InsertionSort.insertionSortInterative(Arrays.asList(2, 2)));
	}

	@Test
	void givenMultipleElementsWithThreeDuplicatesInRow_sortsCorrectly() {
		assertEquals(Arrays.asList(-2, 1, 3, 5, 7, 7, 7, 8),
				InsertionSort.insertionSortInterative(Arrays.asList(5, 3, 7, 7, 7, -2, 8, 1)));
	}

	// ---------------------------------------------------

	@Test
	void givenEmptyList_2returnsEmptyList() {
		assertEquals(Arrays.asList(), SelectionSort.selectionSortIterative(Arrays.asList()));
	}

	@Test
	void givenOneElement_sorts2Correctly() {
		assertEquals(Arrays.asList(8), SelectionSort.selectionSortIterative(Arrays.asList(8)));
	}

	@Test
	void givenTwoElements_sorts2Correctly() {
		assertEquals(Arrays.asList(2, 6), SelectionSort.selectionSortIterative(Arrays.asList(6, 2)));
	}

	@Test
	void givenMultipleElements_sorts2Correctly() {
		assertEquals(Arrays.asList(-7, -5, 1, 2, 3, 4, 6, 8),
				SelectionSort.selectionSortIterative(Arrays.asList(8, 2, -5, 1, -7, 6, 3, 4)));
	}

	@Test
	void givenMultipleElementsWithDuplicates_sorts2Correctly() {
		assertEquals(Arrays.asList(-4, 5, 8, 8, 11, 11),
				SelectionSort.selectionSortIterative(Arrays.asList(8, 8, 5, 11, -4, 11)));
	}

	@Test
	void givenTwoElementsWithDuplicates_sorts2Correctly() {
		assertEquals(Arrays.asList(2, 2), SelectionSort.selectionSortIterative(Arrays.asList(2, 2)));
	}

	@Test
	void givenMultipleElementsWithThreeDuplicatesInRow_sorts2Correctly() {
		assertEquals(Arrays.asList(-2, 1, 3, 5, 7, 7, 7, 8),
				SelectionSort.selectionSortIterative(Arrays.asList(5, 3, 7, 7, 7, -2, 8, 1)));
	}
	
	//-------------------------------------------------
	
	@Test
	void givenEmptyListRecursive_2returnsEmptyList() {
		assertEquals(Arrays.asList(), SelectionSort.selectionSortRecursive(Arrays.asList(), 0));
	}

	@Test
	void givenOneElementRecursive_sorts2Correctly() {
		assertEquals(Arrays.asList(8), SelectionSort.selectionSortRecursive(Arrays.asList(8), 0));
	}

	@Test
	void givenTwoElementsRecursive_sorts2Correctly() {
		assertEquals(Arrays.asList(2, 6), SelectionSort.selectionSortRecursive(Arrays.asList(6, 2), 0));
	}

	@Test
	void givenMultipleElementsRecursive_sorts2Correctly() {
		assertEquals(Arrays.asList(-7, -5, 1, 2, 3, 4, 6, 8),
				SelectionSort.selectionSortRecursive(Arrays.asList(8, 2, -5, 1, -7, 6, 3, 4), 0));
	}

	@Test
	void givenMultipleElementsWithDuplicatesRecursive_sorts2Correctly() {
		assertEquals(Arrays.asList(-4, 5, 8, 8, 11, 11),
				SelectionSort.selectionSortRecursive(Arrays.asList(8, 8, 5, 11, -4, 11), 0));
	}

	@Test
	void givenTwoElementsWithDuplicatesRecursive_sorts2Correctly() {
		assertEquals(Arrays.asList(2, 2), SelectionSort.selectionSortRecursive(Arrays.asList(2, 2), 0));
	}

	@Test
	void givenMultipleElementsWithThreeDuplicatesInRowRecursive_sorts2Correctly() {
		assertEquals(Arrays.asList(-2, 1, 3, 5, 7, 7, 7, 8),
				SelectionSort.selectionSortRecursive(Arrays.asList(5, 3, 7, 7, 7, -2, 8, 1), 0));
	}
	//-------------------------------------------------
	
		@Test
		void givenEmptyListRecursive_returnsEmptyList() {
			assertEquals(Arrays.asList(), InsertionSort.insertionSortRecursive(Arrays.asList(), 0));
		}

		@Test
		void givenOneElementRecursive_sortsCorrectly() {
			assertEquals(Arrays.asList(8), InsertionSort.insertionSortRecursive(Arrays.asList(8), 0));
		}

		@Test
		void givenTwoElementsRecursive_sortsCorrectly() {
			assertEquals(Arrays.asList(2, 6), InsertionSort.insertionSortRecursive(Arrays.asList(6, 2), 0));
		}

		@Test
		void givenMultipleElementsRecursive_sortsCorrectly() {
			assertEquals(Arrays.asList(-7, -5, 1, 2, 3, 4, 6, 8),
					InsertionSort.insertionSortRecursive(Arrays.asList(8, 2, -5, 1, -7, 6, 3, 4), 0));
		}

		@Test
		void givenMultipleElementsWithDuplicatesRecursive_sortsCorrectly() {
			assertEquals(Arrays.asList(-4, 5, 8, 8, 11, 11),
					InsertionSort.insertionSortRecursive(Arrays.asList(8, 8, 5, 11, -4, 11), 0));
		}

		@Test
		void givenTwoElementsWithDuplicatesRecursive_sortsCorrectly() {
			assertEquals(Arrays.asList(2, 2), InsertionSort.insertionSortRecursive(Arrays.asList(2, 2), 0));
		}

		@Test
		void givenMultipleElementsWithThreeDuplicatesInRowRecursive_sortsCorrectly() {
			assertEquals(Arrays.asList(-2, 1, 3, 5, 7, 7, 7, 8),
					InsertionSort.insertionSortRecursive(Arrays.asList(5, 3, 7, 7, 7, -2, 8, 1), 0));
		}
}
