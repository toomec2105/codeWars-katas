package katas;

import java.util.HashMap;
public class WriteNumberInExtendedForm {
    public static String expandedForm(int num) {
        String number = String.valueOf(num);
        String output = "";
        int numberOfDigits = number.length();
        HashMap < Integer, Character > digitPositons = mapIndexToDigit(number);

        for (int i = 0; i < numberOfDigits; i++) {

            if (digitPositons.get(i) != '0') {
                output += digitPositons.get(i);
                output += addZeroes(numberOfDigits, i);
            }

            int nextIndex = i + 1;
            if (nextIndex >= numberOfDigits) {
                break;
            } else if (digitPositons.get(nextIndex) != '0') {
                output += " + ";
            }
        }
        return output;
    }

    public static HashMap < Integer, Character > mapIndexToDigit(String number) {
        HashMap < Integer, Character > digitsAndIndexes = new HashMap();

        for (int i = 0; i < number.length(); i++) {
            digitsAndIndexes.put(i, number.charAt(i));
        }

        return digitsAndIndexes;
    }

    public static String addZeroes(int numberOfDigits, int digitIndex) {
        String zeroes = "";

        for (int j = 0; j < numberOfDigits - digitIndex - 1; j++) {
            zeroes += "0";
        }

        return zeroes;
    }
    
    //---------------------------------------------------
    public static String expandedFormOptimal(int num){
        String output = "";
        for (int i = 10; i < num; i *= 10) {
            int remainder = num % i;
            output = (remainder > 0) ? (" + " + remainder + output) : output;
            num -= remainder;
        }
        output = num + output;
        
        return output;
    }
    
    
    
    
    
    
}