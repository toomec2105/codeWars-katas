package katas;

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
}