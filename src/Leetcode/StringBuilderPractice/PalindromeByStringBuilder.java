package Leetcode.StringBuilderPractice;

public class PalindromeByStringBuilder {

    public static boolean isPalindrome(String str) {

        if (str.equals(null)) {
            System.out.println("false");
            return false;
        }

        // Additional logic for checking palindrome can be added here

        return true;
    }

    public static void main(String[] args) {
        String word = ""; // Example string to check

        if (isPalindrome(word)) {
            System.out.println(word + " is a Palindrome.");
        } else {
            System.out.println(word + " is not a Palindrome.");
        }

        // Additional logic using StringBuilder can be added here
        StringBuilder sb = new StringBuilder(word);
        String reversed = sb.reverse().toString();
        System.out.println("Reversed: " + reversed);
    }
}
