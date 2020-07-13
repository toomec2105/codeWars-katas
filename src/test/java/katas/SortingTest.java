package katas;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class SortingTest {
	@Test
	void givenEmptyList_returnsEmptyList() {
		 assertEquals(Arrays.asList(), Sort.sort(Arrays.asList()));
	}
	
	
	  @Test void givenOneElement_sortsCorrectly() { assertEquals(Arrays.asList(8),
	  Sort.sort(Arrays.asList(8))); }
	  
		
		  @Test void givenTwoElements_sortsCorrectly() {
		  assertEquals(Arrays.asList(2,6), Sort.sort(Arrays.asList(6,2))); }
		  
		
		  @Test void givenMultipleElements_sortsCorrectly() {
		  assertEquals(Arrays.asList(-7,-5,1,2,3,4,6,8),
		  Sort.sort(Arrays.asList(8,2,-5,1,-7,6,3,4))); }
		  
		
		  @Test void givenMultipleElementsWithDuplicates_sortsCorrectly() {
		  assertEquals(Arrays.asList(-4,5,8,8,11,11),
		  Sort.sort(Arrays.asList(8,8,5,11,-4,11))); }
		  
		  @Test void givenTwoElementsWithDuplicates_sortsCorrectly() {
		  assertEquals(Arrays.asList(2,2), Sort.sort(Arrays.asList(2,2))); }
		  
		  @Test void givenMultipleElementsWithThreeDuplicatesInRow_sortsCorrectly() {
		  assertEquals(Arrays.asList(-2,1,3,5,7,7,7,8),
		  Sort.sort(Arrays.asList(5,3,7,7,7,-2,8,1))); }
		 
		 
	 
	 
}
