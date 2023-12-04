package Leetcode.StringBuilderPractice;

public class Pr {

        public static void main(String[] args) {
            String input = "I am a boy";
            String reversed = reverseWords(input);
            System.out.println("Input: " + input);
            System.out.println("Output: " + reversed);
        }

        public static String reverseWords(String input) {
            String[] words = input.split(" ");
            StringBuilder reversedBuilder = new StringBuilder();

            for (int i = words.length - 1; i >= 0; i--) {
                reversedBuilder.append(words[i]).append(" ");
            }

            // Remove the trailing space
            if (reversedBuilder.length() > 0) {
                reversedBuilder.setLength(reversedBuilder.length() - 1);
            }

            return reversedBuilder.toString();
        }
    }

