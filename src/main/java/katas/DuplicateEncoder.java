package katas;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.lang.StringBuilder;
import java.util.HashMap;
public class DuplicateEncoder {
    static String encode(final String word) {
        StringBuilder encoded = new StringBuilder(word.toLowerCase());
        HashMap < String, Integer > repeatedLetters = new HashMap();
        
        for (int i = 0; i < encoded.length(); i++) {
            String currentLetter = String.valueOf(encoded.charAt(i));
            Integer letterIndex = repeatedLetters.get(currentLetter);

            if (letterIndex == null) {
                repeatedLetters.put(currentLetter, i);
                encoded.setCharAt(i, "(".charAt(0));
            } else {            
                encoded.setCharAt(i, ")".charAt(0));
                
                if (letterIndex >= 0) {
                    encoded.setCharAt(repeatedLetters.get(currentLetter), ")".charAt(0));
                    int letterIsRepeated = -1;
                    repeatedLetters.put(currentLetter, letterIsRepeated);
                } 
            }
        }

        return String.valueOf(encoded);
    }
}