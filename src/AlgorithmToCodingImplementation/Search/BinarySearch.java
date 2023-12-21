package AlgorithmToCodingImplementation.Search;

// Binary search is an efficient algorithm for finding an element in a sorted array

import java.util.Scanner;

public class BinarySearch {

        public static int binarySearch(int[] array, int target) {
            int left = 0;
            int right = array.length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                // Check if the target is present at the middle
                if (array[mid] == target) {
                    return mid;
                }

                // If the target is greater, ignore the left half
                if (array[mid] < target) {
                    left = mid + 1;
                }
                // If the target is smaller, ignore the right half
                else {
                    right = mid - 1;
                }
            }

            // Target not present in the array
            return -1;
        }

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            int target = input.nextInt();
            System.out.println("Type the number to search");
            int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

            int result = binarySearch(sortedArray, target);

            if (result != -1) {
                System.out.println("Element " + target + " found at index " + result);
            } else {
                System.out.println("Element " + target + " not found in the array.");
            }
        }
    }
