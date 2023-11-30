package Programiz;

import java.util.Arrays;

public class ReverseAnArray {

    public static void main(String[] args) {
        int[] numArr = {3, 4, 1, 5, 7, 9};
        int[] reversedArray = reverseArray(numArr);
        System.out.println(Arrays.toString(reversedArray));
    }

    public static int[] reverseArray(int[] arr) {
        int[] reversedArr = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            reversedArr[arr.length - (i + 1)] = arr[i];
        }
        return reversedArr;
    }
}
