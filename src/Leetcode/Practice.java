package Leetcode;

public class Practice {

        public static void main(String[] args) {
            int[] array = {1,4,2,5,3};

            generateSubarrays(array);
        }

        static void generateSubarrays(int[] array) {
            int n = array.length;
            int  subarraySum = 0;
            int totalSum = 0;

            // Outer loop: starting index of subarray
            for (int i = 0; i < n; i++) {
                // Inner loop: ending index of subarray
                for (int j = i; j < n; j=j+2) {

                    // Print the subarray from index i to j
                    for (int k = i; k <= j; k++) {
                        subarraySum += array[j];

                        System.out.print(array[k] + " ");
                    }
                    System.out.println(subarraySum);

                    System.out.println(); // Move to the next line for the next subarray
                }

            }

        }
    }
