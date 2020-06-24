package katas;
/*Your task is to sort a given string. Each word in the string will contain a single number. This number is the position the word should have in the result.

Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).

If the input string is empty, return an empty string. The words in the input String will only contain valid consecutive numbers.

"is2 Thi1s T4est 3a"  -->  "Thi1s is2 3a T4est"
"4of Fo1r pe6ople g3ood th5e the2"  -->  "Fo1r the2 g3ood 4of th5e pe6ople"
""  -->  ""*/


import java.util.Arrays;
import java.util.Comparator;

public class Order {
    public static String order(final String words) {

        if (words == null || words.length() == 0) {
            return "";
        }

        String[] tokens = words.split(" ");
        String[] output = new String[tokens.length];

        for (int i = 0; i < tokens.length; i++) {
            int digitInToken = 0;
            String currentToken = "";
            
            for (int j = 0; j < tokens[i].length(); j++) {
            
                currentToken = tokens[i];
                if (Character.isDigit(currentToken.charAt(j))) {
                    digitInToken = Integer.parseInt(String.valueOf(currentToken.charAt(j)));
                }
            }

            int tokenIndex = digitInToken - 1;
            output[tokenIndex] = currentToken;
        }
        
        return String.join(" ", output);
    }
    
    public static String orderOptimal(String words) {
        return Arrays.stream(words.split(" "))
          .sorted(Comparator.comparing(s -> Integer.valueOf(s.replaceAll("\\D", ""))))
          .reduce((a, b) -> a + " " + b).get();
      }
    
}