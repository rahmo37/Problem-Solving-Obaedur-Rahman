package Programiz;

import java.util.Arrays;

public class swap0sand1s {

    public static int[] swap0sand1s(int[] numArr) {
        int[] sortOsn1s = new int[numArr.length];
        int left = 0;
        int right = numArr.length - 1;
        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] == 0) {
                sortOsn1s[left] = 0;
                left++;
            } else {
                sortOsn1s[right] = 1;
                right--;
            }
        }
        return sortOsn1s;


//        chatGPT solution
//        int left = 0;
//        int right = array.length - 1;
//
//        while (left < right) {
//            // Increment left index while we see 0 at left
//            while (array[left] == 0 && left < right) {
//                left++;
//            }
//
//            // Decrement right index while we see 1 at right
//            while (array[right] == 1 && left < right) {
//                right--;
//            }
//
//            // If left is less than right then there is a 1 at left
//            // and a 0 at right. Exchange array[left] and array[right]
//            if (left < right) {
//                array[left] = 0;
//                array[right] = 1;
//                left++;
//                right--;
//            }
//        }
    }

    public static void main(String[] args) {

        int[] numArr = {0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1};

        System.out.println(Arrays.toString(swap0sand1s(numArr)));
    }
}
