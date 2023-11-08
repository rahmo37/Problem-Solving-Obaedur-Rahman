public class SumOfLagersAAndSmallest {

    public static int getSum(int[] numArr) {
        int sum;
        int largest = numArr[0];
        int smallest = numArr[0];

        for(int i = 0; i < numArr.length; i++) {
            if(largest < numArr[i]) {
                largest = numArr[i];
            }
            if(smallest > numArr[i]) {
                smallest = numArr[i];
            }
        }
        sum = largest + smallest;
        return sum;
    }

    public static void main(String[] args) {
        int[] numArr = {21, 23, 34, 546, 67, 77};
        int sum = getSum(numArr);
        System.out.println(sum);
    }
}
