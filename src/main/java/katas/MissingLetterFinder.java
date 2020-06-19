package katas;

import java.util.Arrays;
import java.util.List;
public class MissingLetterFinder {
    public static char findMissingLetter(char[] array) {
        Character[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        List < Character > temp = Arrays.asList(alphabet);
        boolean isUpperCase = Character.isUpperCase(array[0]);
        int firstLetterIndex = temp.indexOf(String.valueOf(array[0]).toLowerCase().charAt(0));
        char expectedLetter = '\0';
        
        for (int i = 0; i < array.length; i++) {
        
            expectedLetter = isUpperCase ? 
                         Character.toUpperCase(alphabet[firstLetterIndex + i]):
                         alphabet[firstLetterIndex + i];
                         
            if (array[i] != expectedLetter) {
                break;
            }
        }
        return expectedLetter;
    }
}