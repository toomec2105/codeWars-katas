package katas;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class SortTheOdd {
    public static int[] sortArray(final int[] array) {
        if (array.length == 0) {
            return array;
        }  
        
        int[] sortedArray = array;
        ArrayList<Integer> oddNumsIndexes = new ArrayList<Integer>();
        ArrayList < Integer > oddNumbersUnsorted = new ArrayList<>();
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                oddNumsIndexes.add(i);
                oddNumbersUnsorted.add(array[i]);
            }
        }
        Collections.sort(oddNumbersUnsorted);
        
        for (int i = 0; i < oddNumsIndexes.size(); i++) {
            sortedArray[(int) oddNumsIndexes.get(i)] = oddNumbersUnsorted.get(i);
        }

        return sortedArray;
    }
    
    public static int[] sortArrayOptimal(final int[] array) {

        // Sort the odd numbers only
        final int[] sortedOdd = Arrays.stream(array).filter(e -> e % 2 == 1).sorted().toArray();
        
        // Then merge them back into original array
        for (int j = 0, s = 0; j < array.length; j++) {
          if (array[j] % 2 == 1) {
        	  array[j] = sortedOdd[s++];
          
          }
        }
        
        return array;
    }
}
