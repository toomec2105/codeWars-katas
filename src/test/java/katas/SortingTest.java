package katas;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class SortingTest {
	@Test
	void givenEmptyList_returnsEmptyList() {
		 assertEquals(Arrays.asList(), Sort.insertionSort(Arrays.asList()));
	}
	
	
	  @Test void givenOneElement_sortsCorrectly() { assertEquals(Arrays.asList(8),
	  Sort.insertionSort(Arrays.asList(8))); }
	  
		
		  @Test void givenTwoElements_sortsCorrectly() {
		  assertEquals(Arrays.asList(2,6), Sort.insertionSort(Arrays.asList(6,2))); }
		  
		
		  @Test void givenMultipleElements_sortsCorrectly() {
		  assertEquals(Arrays.asList(-7,-5,1,2,3,4,6,8),
		  Sort.insertionSort(Arrays.asList(8,2,-5,1,-7,6,3,4))); }
		  
		
		  @Test void givenMultipleElementsWithDuplicates_sortsCorrectly() {
		  assertEquals(Arrays.asList(-4,5,8,8,11,11),
		  Sort.insertionSort(Arrays.asList(8,8,5,11,-4,11))); }
		  
		  @Test void givenTwoElementsWithDuplicates_sortsCorrectly() {
		  assertEquals(Arrays.asList(2,2), Sort.insertionSort(Arrays.asList(2,2))); }
		  
		  @Test void givenMultipleElementsWithThreeDuplicatesInRow_sortsCorrectly() {
		  assertEquals(Arrays.asList(-2,1,3,5,7,7,7,8),
		  Sort.insertionSort(Arrays.asList(5,3,7,7,7,-2,8,1))); }
		 
		 //---------------------------------------------------
		  
			@Test
			void givenEmptyList_2returnsEmptyList() {
				 assertEquals(Arrays.asList(), Sort.selectionSort(Arrays.asList()));
			}
			
			
			  @Test void givenOneElement_sorts2Correctly() { assertEquals(Arrays.asList(8),
			  Sort.selectionSort(Arrays.asList(8))); }
			  
				
				  @Test void givenTwoElements_sorts2Correctly() {
				  assertEquals(Arrays.asList(2,6), Sort.selectionSort(Arrays.asList(6,2))); }
				  
				
				  @Test void givenMultipleElements_sorts2Correctly() {
				  assertEquals(Arrays.asList(-7,-5,1,2,3,4,6,8),
				  Sort.selectionSort(Arrays.asList(8,2,-5,1,-7,6,3,4))); }
				  
				
				  @Test void givenMultipleElementsWithDuplicates_sorts2Correctly() {
				  assertEquals(Arrays.asList(-4,5,8,8,11,11),
				  Sort.selectionSort(Arrays.asList(8,8,5,11,-4,11))); }
				  
				  @Test void givenTwoElementsWithDuplicates_sorts2Correctly() {
				  assertEquals(Arrays.asList(2,2), Sort.selectionSort(Arrays.asList(2,2))); }
				  
				  @Test void givenMultipleElementsWithThreeDuplicatesInRow_sorts2Correctly() {
				  assertEquals(Arrays.asList(-2,1,3,5,7,7,7,8),
				  Sort.selectionSort(Arrays.asList(5,3,7,7,7,-2,8,1))); }
	 
	 
}
