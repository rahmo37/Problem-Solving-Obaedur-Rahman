package Leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class CheckIfTwoStringArraysAreEquivalentForString1662_B {

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
            return Arrays.equals(word1, word2);
        }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // why we intiate the size variable separately.
        int size; // Talk with Arnob, why this line needed to print correctly.

        // Read the size and consume the newline character
        System.out.print("Enter the size of the array: ");
        size = sc.nextInt();
        sc.nextLine();  // Consume the newline

        String[] word1 = new String[size];
        String[] word2 = new String[size];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            System.out.println("Enter element at index " + i + ": ");
            word1[i] = sc.nextLine();
        }
        for (int j = 0; j < size; j++) {
            System.out.println("Enter element at index " + j + ": ");
            word2[j] = sc.nextLine();
        }
        System.out.println(arrayStringsAreEqual(word1, word2));
    }

}

