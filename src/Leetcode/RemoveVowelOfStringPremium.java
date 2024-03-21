package Leetcode;

import java.util.Scanner;

//
// this is a problem from code wars. solved it here. but could not get correct in the code wars.
// This code is also available in leetcode premium section.

public class RemoveVowelOfStringPremium {

        public static String removeVowels(String input) {
            // Use a regular expression to remove all vowels (both lowercase and uppercase)
            String result = input.replaceAll("[aeiouAEIOU]", "");

            return result;
        }

        public static void main(String[] args) {

            Scanner put = new Scanner(System.in);

            System.out.println("Type any sentence");
            String input = put.nextLine();
            String output = removeVowels(input);
            System.out.println(output);
        }
    }

