package Leetcode;

import java.util.HashMap;
import java.util.Map;


//convert roman number to integer number.
// DEBUG THIS CODE. didnot understand the logic.
public class RomanToNumber {

        public int romanToInt(String s) {
            if (s == null || s.length() == 0) {
                return 0;
            }

            // Create a map to store the values of Roman numerals.
            Map<Character, Integer> romanValues = new HashMap<>();
            romanValues.put('I', 1);
            romanValues.put('V', 5);
            romanValues.put('X', 10);
            romanValues.put('L', 50);
            romanValues.put('C', 100);
            romanValues.put('D', 500);
            romanValues.put('M', 1000);

            int result = 0;
            int prevValue = 0;

            for (int i = s.length() - 1; i >= 0; i--) {
                int currValue = romanValues.get(s.charAt(i));

                if (currValue < prevValue) {
                    result -= currValue;
                } else {
                    result += currValue;
                }

                prevValue = currValue;
            }

            return result;
        }

        public static void main(String[] args) {
            RomanToNumber converter = new RomanToNumber();
            String romanNumeral = "MCMXCIV";
            int integerEquivalent = converter.romanToInt(romanNumeral);
            System.out.println("Integer equivalent of " + romanNumeral + " is " + integerEquivalent);
        }
    }

