package Leetcode;

public class Practice {

        public static void main(String[] args) {
            String[] wordsArray = {"apple", "banana", "orange", "strawberry", "grape"};

            String[] longestWords = findLongestWords(wordsArray);

            for (String word : longestWords) {
                System.out.println(word);
            }
        }

        public static String[] findLongestWords(String[] words) {
            int maxLength = 0;
            int count = 0;

            // Find the length of the longest word
            for (String word : words) {
                if (word.length() > maxLength) {
                    maxLength = word.length();
                    count = 1;
                } else if (word.length() == maxLength) {
                    count++;
                }
            }

            // Create an array to store the longest words
            String[] longestWords = new String[count];
            int index = 0;

            // Populate the array with the longest words
            for (String word : words) {
                if (word.length() == maxLength) {
                    longestWords[index] = word;
                    index++;
                }
            }

            return longestWords;
        }
    }

