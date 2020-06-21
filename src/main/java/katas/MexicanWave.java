package katas;

import java.util.List;
import java.util.ArrayList;
public class MexicanWave {

    public static String[] wave(String str) {
        List < String > wave = new ArrayList();

        for (int i = 0; i < str.length(); i++) {
            char currentLetter = str.charAt(i);
            if (currentLetter != ' ') {

                StringBuilder textToBeWaved = new StringBuilder(str);
                textToBeWaved.setCharAt(i, Character.toUpperCase(currentLetter));
                wave.add(textToBeWaved.toString());
            }

        }

        String[] arr = wave.toArray(new String[] {});
        return arr;
    }
    
    
    
    public static String[] waveOptimal(String str) {    
        List<String> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
          char ch = str.charAt(i);
          
          if (ch == ' ') {
        	  continue;
          }
          
          list.add(str.substring(0,i) + Character.toUpperCase(ch) + str.substring(i+1));
        }
        return list.toArray(new String[0]);
      }
    
}