package Leetcode;

public class RunningSumOf1dArray {
    public static int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] + nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] result = runningSum(nums);
        /*for (int i : result) {
            System.out.println(i);
        }*/

        System.out.println("Result: " + java.util.Arrays.toString(result));
    }

}