package AlgorithmToCodingImplementation.Search;


//The linear search algorithm is a simple search algorithm that finds the position of a target value within
//a list. It sequentially checks each element of the list until a match is found or the entire list has been searched.
// Java code for linearly searching target in arr[]. If target is present then return its location,
// otherwise return -1

import java.util.Scanner;

public class LinearSearch {
        public static int search(int arr[], int target) {
            int N = arr.length;
            for (int i = 0; i < N; i++) {
                if (arr[i] == target)
                    return i;  // Target found, return the index
            }
            return -1; // Target not found
        }

        // Driver's code
        public static void main(String args[]) {

            System.out.println("Type the number to search");

            Scanner input = new Scanner(System.in);


            int target = input.nextInt();


            int arr[] = {2, 3, 4, 10, 40};


            // Method call
            int result = search(arr, target);
            if (result == -1) {
                System.out.print(
                        "Element is not present in array");
            } else {

                System.out.print("Element is present at index "
                        +result);
                    }
        }
    }



