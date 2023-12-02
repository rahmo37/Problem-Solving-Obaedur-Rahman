package Leetcode;
import java.util.Arrays;
import java.util.Scanner;

public class CheckIfTwoStringArraysAreEquivalentForInt1662 {

        public static boolean arrayIntsAreEqual(int[] array1, int[] array2) {
            if (array1.length != array2.length) {
                return false;
            }

            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i]) {
                    return false;
                }
            }

            return true;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int size = sc.nextInt();

            System.out.println("Enter the size of the array:");
            int[] word1 = new int[size];
            int[] word2 = new int[size];
            System.out.println("Enter the elements of the array:");

            for (int i = 0; i < size; i++) {
                System.out.print("Enter element at index " + i + ": ");
                word1[i] = sc.nextInt();
            }

            for (int j = 0; j < size; j++) {
                System.out.print("Enter element at index " + j + ": ");
                word2[j] = sc.nextInt();
            }

            System.out.println(arrayIntsAreEqual(word1, word2));
        }
    }

