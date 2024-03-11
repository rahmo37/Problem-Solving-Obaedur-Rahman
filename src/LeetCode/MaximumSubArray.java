package LeetCode;

public class MaximumSubArray {
    public static void main(String[] args) {
        int[] nums = {-1};
        System.out.println(returnSubArr(nums));
    }

    public static int returnSubArr(int[] nums) {
        int n = nums.length;
        int sum = Integer.MIN_VALUE;
        int subSum = 0;
//        int[] resultArr = {};

        for (int i = 0; i < n; i++) {
            if (nums[i] > sum) {
                sum = nums[i];
//                int[] subArr = {nums[i]};
//                resultArr = subArr;
            }
            subSum = nums[i];
            for (int j = i + 1; j < n; j++) {
                subSum += nums[j];
                if (subSum > sum) {
//                    int l = 0;
                    sum = subSum;
//                    int[] subArr = new int[j - i + 1];
//                    for (int k = i; k <= j; k++) {
//                        subArr[l] = nums[k];
//                        l++;
//                    }
//                    resultArr = subArr;
                }
            }
        }
        return sum;
    }
}
