package Leetcode;

import java.util.Arrays;

public class RunningSumOf1dArray1480 {


    public static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
    }

    public static void main(String[] args) {

        int [] sampleArray = {2,3,5,7,9};

        System.out.println(Arrays.toString(runningSum(sampleArray)));

    }
}


