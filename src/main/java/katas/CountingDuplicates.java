package katas;
import java.util.HashMap;
public class CountingDuplicates {
    public static int duplicateCount(String text) {
        text = text.toLowerCase();
        int counter = 0;
        String[] msgArr = text.split("");
        HashMap < String, Integer > lettersMap = new HashMap < String, Integer > ();

        for (int i = 0; i < msgArr.length; i++) {
            if (lettersMap.get(msgArr[i]) == null) {
                lettersMap.put(msgArr[i], 1);
            } else if (lettersMap.get(msgArr[i]) == 1) {
                lettersMap.put(msgArr[i], lettersMap.get(msgArr[i]) + 1);
                counter++;
            }
        }
        return counter;
    }
}