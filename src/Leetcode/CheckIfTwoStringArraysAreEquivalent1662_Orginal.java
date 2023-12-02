package Leetcode;

public class CheckIfTwoStringArraysAreEquivalent1662_Orginal {

        public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
            // Concatenate strings in word1
            StringBuilder sb1 = new StringBuilder();
            for (String str : word1) {
                sb1.append(str);
            }
            String concatWord1 = sb1.toString();

            // Concatenate strings in word2
            StringBuilder sb2 = new StringBuilder();
            for (String str : word2) {
                sb2.append(str);
            }
            String concatWord2 = sb2.toString();

            // Compare the concatenated strings
            return concatWord1.equals(concatWord2);
        }

        public static void main(String[] args) {
            // Example 1
            String[] word1 = {"ab", "c"};
            String[] word2 = {"a", "bc"};
            System.out.println(arrayStringsAreEqual(word1, word2)); // Output: true

            // Example 2
            String[] word3 = {"a", "cb"};
            String[] word4 = {"ab", "c"};
            System.out.println(arrayStringsAreEqual(word3, word4)); // Output: false

            // Example 3
            String[] word5 = {"abc", "d", "defg"};
            String[] word6 = {"abcddefg"};
            System.out.println(arrayStringsAreEqual(word5, word6)); // Output: true
        }
    }
