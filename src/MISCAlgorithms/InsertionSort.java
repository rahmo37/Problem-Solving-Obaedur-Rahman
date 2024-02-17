package MISCAlgorithms;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {55, 12, 78, 45, 34, 45, 92, 101, 12, 78,
                55, 34, 101, 92, 78, 45, 12, 55, 92, 101,
                34, 78, 45, 12, 101, 55, 92, 34, 78, 45,
                12, 101, 55, 92, 34, 78, 45, 12, 101, 55,
                92, 34, 78, 45, 12, 101, 55, 92, 34, 78,
                45, 12, 101, 55, 92, 34, 78, 45, 12, 101,
                55, 92, 34, 78, 45, 12, 101, 55, 92, 34,
                78, 45, 12, 101, 55, 92, 34, 78, 45, 12,
                101, 55, 92, 34, 78, 45, 12, 101, 55, 92,
                34, 78, 45, 12, 101, 55, 92};
        int len = arr.length;
        insertionSort(arr, len);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort(int[] A, int n) {
        for (int j = 1; j < n; j++) {
            int key = A[j];
            int i = j - 1;
            while (i >= 0 && A[i] < key) {
                A[i + 1] = A[i];
                i = i - 1;
            }
            A[i + 1] = key;
        }
    }
}
