package important.search;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class BinarySearchTest {
	private BinarySearch task1 = new BinarySearch();
	@Test
	void binarySearchTest() {
		
		int[][] nums = {
				  {15},
				  {15,20},
				  {20,15},
				  {3,15,20},
				  {15,16,20},
				  {1,2,15},
				  {1,2,15,20},
				  {5,15,17,20},
				  {1,10,11,14,15,20},
				  {15,16,19,200,210,215}
			};
		for (int[] arr : nums) {
			
			assertEquals(15, task1.binarySearch(arr,15));
		}
	}

}
