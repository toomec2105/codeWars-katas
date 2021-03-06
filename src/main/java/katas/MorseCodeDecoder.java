package katas;

public class MorseCodeDecoder {
    public static String decode(final String morseCode) {
        String decoded = "";
        final String[] tokens = morseCode.trim().split("   ");

        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i];
            String[] letters = token.split(" ");
            
            for (int j = 0; j < letters.length; j++) {
            	//MorseCode breaks the code in eclipse - needs to be imported
                //decoded += MorseCode.get(letters[j]);
            }            
           
            decoded += tokens.length != i + 1 ? " " : "";
        }
        
        return decoded;
    }
    
    public static String decodeOptimal(String morseCode) {
        String result = "";
        for(String word : morseCode.trim().split("   ")) {
          for(String letter : word.split("\\s+")) {
        	  //MorseCode breaks the code in eclipse - needs to be imported
        	  //result += MorseCode.get(letter);
          }
          result += ' ';
        }
        return result.trim();
      }
}