package important.search;

public class BinarySearch {
	public Integer binarySearch(int[] A, int searchedNumber) {

		int start = 0;
		int end = A.length;

		while (start <= end) {
			int middle = (start + end) / 2;

			if (A[middle] == searchedNumber) {
				return searchedNumber;
			} else if (A[middle] > searchedNumber) {
				end = middle - 1;
			} else {
				start = middle + 1;
			}
		}
		return null;
	}
}
