package Leetcode;

public class SumAllOddLengthSubarrays1588 {
    public static void main(String[] args) {
        int[] array = {1, 4, 2, 5, 3};
        System.out.println(sumOddLengthSubarrays(array));
    }

    public static int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int subarraySum = 0;
        int totalSum = 0;

        // Outer loop: starting index of subarray
        for (int i = 0; i < n; i++) {
            // Inner loop: ending index of subarray
            for (int j = i; j < n; j = j + 2) {
                // Print the subarray from index i to j
                for (int k = i; k <= j; k++) {
                    subarraySum += arr[k];
                }
            }

        }
        return subarraySum;
    }
}
