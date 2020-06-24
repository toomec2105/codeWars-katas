package katas;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class SortTheOddTest {
    
    @Test
    public void exampleTest1() {
        assertArrayEquals(new int[]{ 1, 3, 2, 8, 5, 4 }, SortTheOdd.sortArray(new int[]{ 5, 3, 2, 8, 1, 4 }));
    }
    
    @Test
    public void exampleTest2() {
        assertArrayEquals(new int[]{ 1, 3, 5, 8, 0 }, SortTheOdd.sortArray(new int[]{ 5, 3, 1, 8, 0 }));
    }
    
    @Test
    public void exampleTest3() {
        assertArrayEquals(new int[]{}, SortTheOdd.sortArray(new int[]{}));
    }
    
    
    @Test
    public void optimalTest1() {
        assertArrayEquals(new int[]{ 1, 3, 2, 8, 5, 4 }, SortTheOdd.sortArrayOptimal(new int[]{ 5, 3, 2, 8, 1, 4 }));
    }
    
    @Test
    public void optimalTest2() {
        assertArrayEquals(new int[]{ 1, 3, 5, 8, 0 }, SortTheOdd.sortArrayOptimal(new int[]{ 5, 3, 1, 8, 0 }));
    }
    
    @Test
    public void optimalTest3() {
        assertArrayEquals(new int[]{}, SortTheOdd.sortArrayOptimal(new int[]{}));
    }
}