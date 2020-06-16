package katas;

import java.util.HashSet;
import java.util.Collection;
public class PangramChecker {
    public boolean check(String sentence) {
        final String alphabet = "abcdefghijklmnompqrstuvwxyz";
        Collection < String > letters = new HashSet();
        
        for (int i = 0; i < alphabet.length(); i++) {

            letters.add(alphabet.substring(i, i + 1));
        }
        
        for (int i = 0; i < sentence.length(); i++) {

            String currentLetter = sentence.toLowerCase().substring(i, i + 1);
            if (letters.contains(currentLetter)) {

                letters.remove(currentLetter);
                if (letters.size() == 0) {

                    return true;
                }
            }
        }
        return false;
    }
}